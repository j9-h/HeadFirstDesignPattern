package chp1_strategyPattern.afterApplyingPattern.quack;

public class NoQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
