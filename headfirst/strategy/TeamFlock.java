package headfirst.strategy;

import java.util.ArrayList;

/**
 * Created by cFournierg on 2/10/17.
 */
public class TeamFlock {
    FournierDuck fournier = new FournierDuck();
    GallagherDuck gallagher = new GallagherDuck();
    EdwardsDuck edwards = new EdwardsDuck();

    ArrayList<Duck> flock;

    public void TeamFlock() {
        flock = new ArrayList<>(4);
        flock.add(fournier);
        flock.add(gallagher);
        flock.add(edwards);

        for (Duck duck : flock) {
            duck.display();
            duck.performQuack();
        }

        for (Duck duck : flock) {
            duck.performFly();
            duck.performQuack();
        }


    }
}
