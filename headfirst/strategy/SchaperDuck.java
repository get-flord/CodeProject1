/**
 * Created by schaperg on 2/9/17.
 */

package headfirst.strategy;

public class SchaperDuck extends Duck {

    public SchaperDuck() {

        quackBehavior = new SchaperQuack();
        flyBehavior = new FlyWithWings(); // you can choose any of the fly behaviors

    }

    public void display() {
        System.out.println("I'm a real Schaper duck");
    }
}

