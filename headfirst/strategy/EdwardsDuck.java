package headfirst.strategy;

/**
 * Created by manahax on 2/10/17.
 */
public class EdwardsDuck extends Duck {
    public EdwardsDuck(){
        QuackBehavior q = new EdwardsQuack();
        flyBehavior = new EdwardsFly();
    }
    public void display() {
        System.out.println("I'm a real Edwards duck");
    }

}
