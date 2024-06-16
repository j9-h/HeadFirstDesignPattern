package chp1_strategyPattern.afterApplyingPattern;

import chp1_strategyPattern.afterApplyingPattern.fly.NormalFly;
import chp1_strategyPattern.afterApplyingPattern.quack.NormalQuack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehaviour = new NormalFly();
        this.quackBehaviour = new NormalQuack();
    }
    @Override
    public void display() {
        System.out.println("Looks like a Mallard Bird");
    }
}
