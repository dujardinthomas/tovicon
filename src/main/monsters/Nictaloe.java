package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.PistoPoing;
import attacks.Vibrobscur;

public class Nictaloe extends Monster {
	public Nictaloe() {
		super("Nictaloe", "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣶⡤⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠠⣾⣦⡀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣈⣻⡧⢀⠀⠀\n" + 
				"⢷⣦⣤⡀⠀⢀⣠⣤⡆⢰⣶⣶⣾⣿⣿⣷⣕⣡⡀\n" + 
				"⠘⣿⣿⠇⠀⣦⡀⠉⠉⠈⠉⠁⢸⣿⣿⣿⣿⡿⠃\n" + 
				"⠀⠀⠀⣀⣴⣿⣿⣄⣀⣀⣀⢀⣼⣿⣿⣿⠁⠀⠀\n" + 
				"⠀⠀⠀⠀⠉⢩⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⣸⣿⣿⡿⢻⣿⣿⣿⣿⡿⢿⠇⠀⠀\n" + 
				"⠀⠀⠀⠀⢰⣿⣿⣿⠰⠙⠁⠈⣿⣿⠱⠘⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⢸⡏⣾⡿⠁⠀⠀⠀⢿⣼⣷⠁⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠘⠷⢿⣧⡀⠀⠀⠀⠈⠛⢿⣆⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀", new ArrayList<Attack>());
		
		attacks.add(new PistoPoing());
		attacks.add(new Vibrobscur());
	}
}
