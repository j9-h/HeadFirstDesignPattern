package chp1_strategyPattern.afterApplyingPattern;

import chp1_strategyPattern.afterApplyingPattern.fly.NoFly;
import chp1_strategyPattern.afterApplyingPattern.quack.Squeak;

public class ToyDuck extends Duck{

    public ToyDuck() {
        this.flyBehaviour = new NoFly();
        this.quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("Looks like a toy duck");
    }
}
