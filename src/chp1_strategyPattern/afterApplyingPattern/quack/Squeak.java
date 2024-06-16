package chp1_strategyPattern.afterApplyingPattern.quack;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
