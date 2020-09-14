package Decorator;

public class WeaponUpgrade extends PlayerDecorator {
	Player player;
	public WeaponUpgrade(Player player)
	 {
		 this.player = player;
	 }
	 public String toString()
	 {
		 return player.toString()+ "\nUpgraded weapon";
	 }
	 public double getPower()
	 {
		 return player.getPower()+5;
	 }
}
