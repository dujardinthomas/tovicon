package main.monsters;

import java.util.ArrayList;

import main.attacks.CoupDeQueue;
import main.attacks.Uppercut;
import main.tovicon.Attack;
import main.tovicon.Monster;

public class riptencél extends Monster {

	static CoupDeQueue coupDeQueue;
	static Uppercut uppercut;

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
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀", new ArrayList<Attack>());
		
		addAttack(new CoupDeQueue());
		addAttack(new Uppercut());
	}

}
