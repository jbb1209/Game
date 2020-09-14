package Decorator;

public abstract class Player {
	String name;
	String weapon;
	String armor;
	int intellect;
	int attack;
	int defence;
	public String toString()
	{
		return name + "\nAttack: "+ attack + "\nDefence: "+defence+ "\nIntellect:" + intellect;
	}
	public double getPower()
	{
		return attack *3+ intellect/2+defence;
	}
}
