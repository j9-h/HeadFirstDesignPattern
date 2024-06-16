package chp1_strategyPattern.afterApplyingPattern.fly;

public class NormalFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Normal Fly");
    }
}
