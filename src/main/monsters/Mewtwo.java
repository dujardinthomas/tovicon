package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.FrappePsy;
import attacks.PsychoPass;
import attacks.RayonGemme;


public class Mewtwo extends Monster {

	public Mewtwo() {
		super("Mewtwo", "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣤⣄⣾⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⢿⣿⣿⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⢰⣦⠀⠀⠀⣽⢿⣵⣿⡟⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⣀⣀⣽⣷⣖⡤⣵⣿⣧⣭⠁⠀⠀⠀⠀⠀⠀\n" + 
				"⢀⡤⢦⣄⡈⠛⠈⠛⠋⠉⠋⠻⣿⣿⡿⣧⣀⠀⠀⠀⠀⠀\n" + 
				"⣾⠁⠀⠘⣷⣄⠀⠀⠀⠀⠀⠀⠙⣿⣿⡄⠉⠻⣦⠀⠀⠀\n" + 
				"⢹⡄⠀⠀⠘⣿⣦⡀⠀⠀⠀⣠⣾⣿⢯⣯⣤⡀⠈⣷⣄⠀\n" + 
				"⠈⢷⡄⠀⠀⠸⣿⣿⣦⣤⣼⣿⣿⣿⢾⣿⣿⣷⠈⠇⡹⡦\n" + 
				"⠀⠈⢿⣷⣄⡀⠘⢿⣿⡇⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠹⣿⣿⡄⠀⠙⢣⣿⠿⠿⠟⠛⣿⠟⠁⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠉⠀⠀⣠⡿⠃⠀⠀⠀⢠⣿⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⢠⣿⡃⠀⠀⠀⠀⠶⠻⣷⣄⣀⢀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⣰⣿⡿⣿⠀⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",new ArrayList<Attack>());
		attacks.add(new PsychoPass());
		attacks.add(new FrappePsy());

	}
}