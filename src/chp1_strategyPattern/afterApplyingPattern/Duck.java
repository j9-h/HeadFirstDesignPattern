package chp1_strategyPattern.afterApplyingPattern;

import chp1_strategyPattern.afterApplyingPattern.fly.FlyBehaviour;
import chp1_strategyPattern.afterApplyingPattern.quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("Swimming");
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
     this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
     this.quackBehaviour =  quackBehaviour;
    }
}
