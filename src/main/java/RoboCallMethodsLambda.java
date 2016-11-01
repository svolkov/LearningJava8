import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sergey.volkov on 8/19/2016.
 */
public class RoboCallMethodsLambda {
    public void roboCall(Person p){
        System.out.println("RoboCall to " + p.getName()+" " + p.getSurname());
    }
    public void roboMail(Person p){
        System.out.println("RoboMail to " + p.getName()+" " + p.getSurname());
    }
    public void mailContacts(List<Person> persons, Predicate<Person> predicate){
        for (Person p:persons) {
            if(predicate.test(p)){
                roboMail(p);
            }
        }
    }
    public void callContacts(List<Person> persons, Predicate<Person> predicate){
        for (Person p:persons) {
            if(predicate.test(p)){
                roboCall(p);
            }
        }
    }

}
