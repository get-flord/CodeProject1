package headfirst.strategy;

import java.util.ArrayList;

/**
 * Created by cFournierg on 2/10/17.
 */
public class Team6Flock {
    FournierDuck fournier = new FournierDuck();
    GallagherDuck gallagher = new GallagherDuck();
    EdwardsDuck edwards = new EdwardsDuck();
    MurphyDuck murphy = new MurphyDuck();

    ArrayList<Duck> flock;

    public Team6Flock() {
        flock.add(fournier);
        flock.add(gallagher);
        flock.add(edwards);
        flock.add(murphy);

        for (Duck duck : flock) {
            duck.display();
            duck.performQuack();
        }

        for (Duck duck : flock) {
            duck.performFly();
            duck.performFly();
        }
    }
}
