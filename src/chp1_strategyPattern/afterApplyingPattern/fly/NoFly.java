package chp1_strategyPattern.afterApplyingPattern.fly;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
