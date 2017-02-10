/**
 * Created by schaperg on 2/10/17.
 */
package headfirst.strategy;

public class SchaperFlock {
    SchaperDuck  schaper = new SchaperDuck();

	public void SchaperFlock()
    {
        schaper.display();
        schaper.performQuack();
    }

}
