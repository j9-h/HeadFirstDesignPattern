package chp1_strategyPattern.afterApplyingPattern.fly;

public class SpeedFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Speed Fly");
    }
}
