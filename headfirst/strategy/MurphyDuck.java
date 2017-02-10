package headfirst.strategy;

public class MurphyDuck extends Duck
{
	public MurphyDuck()
	{
		quackBehavior = new MurphyQuack();
		flyBehavior = new FlyRocketPowered();
	}
	
	public void display()
	{
		System.out.println("I'm a Murphy duck, everything will go wrong");
	}
}
