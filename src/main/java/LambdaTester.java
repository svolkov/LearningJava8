

import java.util.*;

/**
 * Created by sergey.volkov on 8/12/2016.
 */
public class LambdaTester {
    public static void main(String[] Args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jan","Shults",29));
        personList.add(new Person("Jhon","Shmidt",92));
        personList.add(new Person("Den","Brown",9));
        personList.add(new Person("Ron","Hill",33));

        printList(personList);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });

        printList(personList);

        Collections.sort(personList,(Person obj1, Person obj2) -> obj1.getName().compareTo(obj2.getName()));
        printList(personList);

        System.out.println("=== RunnableTest ===");

        Runnable runnable = () -> System.out.println("Test is running");
        runnable.run();


        Runnable runnable1 = () -> {
           for(int i =0; i<5; i++ ) {
               System.out.println("Test1 is running");
           }
        };

        runnable1.run();

        Printer printer = new Printer() {
            @Override
            public void doPrint() {

            }
        };
        Printer printer1 = () -> System.out.println("Printer printed");
        printer1.doPrint();

        RoboCallMethods robo = new RoboCallMethods();
        robo.mailPilots(personList);
        robo.callChildren(personList);

        RoboCallMethodsLambda roboLambda = new RoboCallMethodsLambda();
        roboLambda.callContacts(personList,person -> person.getAge()<18);
        roboLambda.mailContacts(personList,person -> person.getAge()>18 && person.getAge()<45);

        System.out.println("Foreach() printed");
        personList.forEach(person -> System.out.println(person.getSurname()));


    }


    public static void printList(List<Person> listForPrint){
        Iterator<Person> iterator = listForPrint.iterator();

        while (iterator.hasNext()){
           Person person = iterator.next();
            System.out.println(person.getName()+" "+person.getSurname()+" "+person.getAge());
        }
    }
}
