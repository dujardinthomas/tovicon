package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.CoupDeQueue;
import attacks.Uppercut;

public class Riptencel extends Monster {

	static CoupDeQueue coupDeQueue;
	static Uppercut uppercut;

	public Riptencel() {
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
		
		attacks.add(new CoupDeQueue());
		attacks.add(new Uppercut());
	}

}
