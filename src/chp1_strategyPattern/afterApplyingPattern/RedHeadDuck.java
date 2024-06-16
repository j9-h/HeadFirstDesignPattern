package chp1_strategyPattern.afterApplyingPattern;

import chp1_strategyPattern.afterApplyingPattern.fly.NormalFly;
import chp1_strategyPattern.afterApplyingPattern.quack.NormalQuack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        this.flyBehaviour = new NormalFly();
        this.quackBehaviour = new NormalQuack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Red Head Duck");
    }
}
