package Decorator;

public class Mage extends Player{
	
	public Mage(String name)
	{
		String Name = "Mage: " +name+"\nCarries a Staff and Robe" ;
		this.name = Name;
		this.attack = 3;
		this.defence = 4;
		this.intellect =7;
		
	}
	public String toString()
	{
		return  super.toString() ;
	}
}
