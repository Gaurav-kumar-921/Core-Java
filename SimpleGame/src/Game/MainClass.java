package Game;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 player = new Player1("Gaurav","AKM",10000);
		
//		System.out.println(player.getName());
//		System.out.println(player.getHealth());
//		System.out.println(player.getWeapon());
		
		player.damageByGun1();
		player.damageByGun1();
//		player.damageByGun2();
		player.heal();
		player.damageByGun1();
		
//		Player2 betterPlayer = new Player2("Pawan","AKM", 100 , false);
//		betterPlayer.damageByGun1();
//		betterPlayer.damageByGun1();
//		betterPlayer.damageByGun2();
//		betterPlayer.heal();
//		betterPlayer.damageByGun2();
//		betterPlayer.damageByGun1();
		
		
	}

}
