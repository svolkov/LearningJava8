package apples;

import java.util.*;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

/**
 * Created by sergey.volkov on 9/26/2016.
 */
public class ApplesLauncher {
    public  static void main(String[] args){

        List<Apple> apples = Arrays.asList(new Apple("red", 150),
                                           new Apple("green", 50),
                                           new Apple("yellow", 100),
                                           new Apple("red", 75));
        List<Apple> finalApplesList = appleFiltering(apples, new AppleHeavyWeightPredicate());
        finalApplesList.stream().forEach((Apple a)->System.out.println(a.weight));

        List<Apple> mostFinalApplesList = filter(apples, (Apple a) -> a.weight <= 100);
        mostFinalApplesList.stream().forEach((Apple a)->System.out.println(a.weight));

        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        apples.stream().forEach((a) -> System.out.println("Apple: Color "+a.getColor()+", Weight "+a.getWeight()));

        apples.sort((a1,a2) -> a2.getWeight() - a1.getWeight());

        apples.stream().forEach((a) -> System.out.println("Apple: Color "+a.getColor()+", Weight "+a.getWeight()));

      //  apples.sort(Comparator.comparing((Apple a) -> a.getWeight()));

        apples.sort(comparing(Apple::getWeight));

        apples.stream().forEach((a) -> System.out.println("Apple: Color "+a.getColor()+", Weight "+a.getWeight()));
    }

    public static List<Apple> appleFiltering(List<Apple> applesList, PredicateForApples p){
        List<Apple> resultList = new ArrayList<>();
        for(Apple apple : applesList) {
            if (p.test(apple)){
                resultList.add(apple);
            }
        }
        return resultList;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> resultList = new ArrayList<>();
        for (T t : list){
           if(p.test(t)){
               resultList.add(t);
           }
        }
        return resultList;
    }
}
