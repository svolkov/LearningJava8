/**
 * Created by sergey.volkov on 8/12/2016.
 */
public class Person {
   private String Name;
   private String Surname;
   private int Age;



    public Person(String name, String surname, int age){
       Name = name;
       Surname = surname;
       Age = age;

   }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {

        return Name;
    }
}
