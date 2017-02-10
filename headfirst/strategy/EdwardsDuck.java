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
<<<<<<< HEAD
        System.out.println("卫生纸 - 'Toilet Paper'");
    }
=======
        System.out.println("I'm a real Edwards duck");}

>>>>>>> 0bb3c37ee526c249d67c313d32452b9e688fab38
}
