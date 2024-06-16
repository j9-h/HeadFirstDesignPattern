package chp1_strategyPattern.beforeApplyingPattern;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Looks like a rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }

    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
