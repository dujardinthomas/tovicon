package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.CoupDeQueue;
import attacks.RafaleFeu;

public class Riptencel extends Monster {

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
		attacks.add(new RafaleFeu());
	}

}
