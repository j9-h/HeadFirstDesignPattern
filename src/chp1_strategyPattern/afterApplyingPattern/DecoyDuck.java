package chp1_strategyPattern.afterApplyingPattern;

import chp1_strategyPattern.afterApplyingPattern.fly.NoFly;
import chp1_strategyPattern.afterApplyingPattern.quack.NoQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        this.quackBehaviour = new NoQuack();
        this.flyBehaviour = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Decoy Duck");
    }
}
