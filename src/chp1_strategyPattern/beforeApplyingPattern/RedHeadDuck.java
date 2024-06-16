package chp1_strategyPattern.beforeApplyingPattern;

public class RedHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Looks like a RedHead Duck!");
    }

    public void swim() {
        System.out.println("Swim like red head duck");
    }
}
