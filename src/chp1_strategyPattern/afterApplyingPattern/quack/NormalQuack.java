package chp1_strategyPattern.afterApplyingPattern.quack;

public class NormalQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Normal Quack");
    }
}
