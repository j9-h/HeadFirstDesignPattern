package chp1_strategyPattern.afterApplyingPattern;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck toyDuck = new ToyDuck();
        Duck decoyDuck = new DecoyDuck();

        List<Duck> ducks = List.of(mallardDuck, redheadDuck, toyDuck, decoyDuck);

        for (Duck duck: ducks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }


    }
}
