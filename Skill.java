package Decorator;

public class Skill extends PlayerDecorator{
	Player player;
	public Skill(Player player)
	 {
		 this.player = player;
	 }
	 public String toString()
	 {
		 return player.toString()+ "\nGained a skill";
	 }
	 public double getPower()
	 {
		 return player.getPower()+2;
	 }
}
