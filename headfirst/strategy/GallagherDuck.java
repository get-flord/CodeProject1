package headfirst.strategy;

public class GallagherDuck extends Duck {

    public GallagherDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyRocketPowered();

    }

    public void display() {
        System.out.println("I, James Edward Gallagher, am a Duck. A Duck of firm morals, a Duck of powerful enterprise.");
    }
}