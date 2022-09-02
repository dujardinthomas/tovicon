package monsters;

import java.util.ArrayList;

import attacks.CoupDeQueue;
import attacks.Uppercut;
import tovicon.Attack;
import tovicon.Monster;

public class riptencél extends Monster {

	static CoupDeQueue coupDeQueue ;
	static Uppercut uppercut;
	public static ArrayList<Attack> attaque;

	public riptencél() {
		super("Riptencél", "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⣀⠠⠂⢁⠔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⣠⠊⠁⠀⠀⡀⠙⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⢳⠄⠸⣰⣮⡁⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⢰⠃⡀⠀⠀⠀⡀⢀⠎⠀⠀⠀⠀⠀⠀⠰⢠⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠐⠢⢥⣬⠄⠀⢸⡀⠀⠀⠀⠀⠀⠀⡞⠻⣰⣄⠀\n" + 
				"⠀⠀⠀⢀⠄⠀⠐⠊⡤⠄⡀⠀⠀⠁⠤⢀⡀⠀⠀⣱⠀⠀⣼⡀\n" + 
				"⠀⢀⠔⠁⢀⠤⠐⡎⠀⠀⠐⠀⠀⢲⠄⠀⠈⢄⢸⠛⠀⠀⠀⢸\n" + 
				"⣰⢅⣔⡶⠁⠀⢸⠀⠀⠀⠀⠃⠀⠀⢂⡇⠀⠘⡄⠑⣄⣤⢠⠁\n" + 
				"⠙⠺⠋⠀⠀⠀⣈⠀⠀⠀⠀⢸⡀⠀⠈⣧⡠⢤⡅⠀⡘⢸⠅⠀\n" + 
				"⠀⠀⠀⠀⢀⠊⠘⠄⠀⠀⠀⡘⠀⠀⠀⠙⡿⠎⠥⠊⣠⠎⠀⠀\n" + 
				"⠀⠀⠀⠀⡧⠀⠀⠈⢂⡄⣀⣃⠀⠀⠀⢀⠧⠄⢐⠨⠊⠀⠀⠀\n" + 
				"⠀⠀⠀⢀⡜⠀⠀⢀⡇⠀⠀⠈⣢⠈⣄⠈⡅⠉⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠻⠮⠓⠂⠁⠀⠀⠀⠀⠷⡎⡢⣗⠇⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀", attaque);
		
		riptencél.attaque = new ArrayList<Attack>();
		attaque.add(coupDeQueue);
		attaque.add(uppercut);
	}

}
