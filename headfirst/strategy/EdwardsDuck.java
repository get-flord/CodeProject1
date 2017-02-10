package headfirst.strategy;

/**
 * Created by manahax on 2/10/17.
 */
public class EdwardsDuck {
    public EdwardsDuck(){
        QuackBehavior q = new EdwardsQuack();
        //flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("卫生纸");}

}
