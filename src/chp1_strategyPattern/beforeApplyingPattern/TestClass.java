package chp1_strategyPattern.beforeApplyingPattern;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        List<Duck> ducks = List.of(mallardDuck, redheadDuck, rubberDuck, decoyDuck);

        for (Duck duck:ducks) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
            System.out.println();
        }
    }
}
