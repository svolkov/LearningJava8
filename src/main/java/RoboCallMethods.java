import java.util.List;

/**
 * Created by sergey.volkov on 8/19/2016.
 */
public class RoboCallMethods {
    public void roboCall(Person p){
        System.out.println("RoboCall to " + p.getName()+" " + p.getSurname());
    }
    public void roboMail(Person p){
        System.out.println("RoboMail to " + p.getName()+" " + p.getSurname());
    }
    public void mailPilots(List<Person> persons){
        for (Person p:persons) {
          if(p.getAge()>18 && p.getAge()<45){
              roboMail(p);
          }
        }
    }
    public void callChildren(List<Person> persons){
        for (Person p:persons) {
            if(p.getAge()<18){
                roboCall(p);
            }
        }
    }
}
