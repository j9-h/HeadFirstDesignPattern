package chp1_strategyPattern.beforeApplyingPattern;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Looks like a Decoy Duck");
    }

    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }

    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
