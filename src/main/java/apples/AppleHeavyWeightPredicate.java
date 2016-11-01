package apples;

/**
 * Created by sergey.volkov on 9/27/2016.
 */
public class AppleHeavyWeightPredicate implements PredicateForApples {

    @Override
    public boolean test(Apple apple) {
        return apple.weight > 80;
    }
}
