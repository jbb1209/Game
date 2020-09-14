package Decorator;

public class Warrior extends Player{
	
	
	
	public Warrior(String name)
	{
		String Name = "Warrior: " +name+ "\nCarries a Sword and Breast Plate";
		this.name = Name;
		this.attack = 8;
		this.defence = 5;
		this.intellect = 2;
	}
	public String toString()
	{
		return  super.toString() ;
	}
	
}
