package Decorator;

public class Healer extends Player {
	
	public Healer(String name)
	{
		String Name = "Healer: " +name+ "\nCarries a Staff and Robe" ;
		this.name = Name;
		this.attack = 2;
		this.defence = 3;
		this.intellect =8;
		
	}
	public String toString()
	{
		return  super.toString();
	}
}
