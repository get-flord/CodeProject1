package headfirst.strategy;

public class FournierDuck extends Duck {
    public FournierDuck() {
        quackBehavior = new FournierQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a FournierDuck. I'm no duck at all.");
    }

}
