package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.CoupDeQueue;
import attacks.ViveAttaque;


public class Brindille extends Monster{

	public Brindille() {
		super("Brindille","⠀⠀⠀⢀⡤⠔⠒⠚⠉⢙⣒⣒⡤⣀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⢀⠔⠁⠀⠀⠀⢠⠊⠁⢠⠊⠉⠁⠀⡤⢌⢢⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⢀⠏⠀⠠⠀⠀⠀⡇⠀⠀⢸⡶⠀⠀⠸⢷⠈⢣⠱⡀⠀⠀⠀⠀⠀\n" + 
				"⢸⠀⡰⠁⠀⠀⡜⠀⠀⠀⢸⣇⠇⠀⣀⡙⠓⠁⠀⠱⠀⠀⠀⠀⠀\n" + 
				"⢸⢠⠃⠀⢀⠜⠀⠀⠀⠀⢈⡆⠀⠹⠤⠃⠀⠀⠀⣀⣿⠀⠀⠀⠀\n" + 
				"⢸⣸⠀⣠⠋⠀⠀⠀⢀⠠⠬⠃⣾⡆⣠⣄⠀⣴⣦⠛⠻⡀⠀⠀⠀\n" + 
				"⠀⢿⣰⠁⠀⢰⠒⠖⠁⠀⠀⠀⠀⠀⠙⠋⠀⠈⠁⠀⠀⠈⢦⠀⠀\n" + 
				"⠀⠈⠷⠀⠀⢸⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠀⠀⠀⢱⣄\n" + 
				"⠀⠀⠀⠀⢀⠎⠀⠀⠀⠀⠀⠀⢄⠀⠀⠀⡀⡠⠊⠑⠢⠤⠤⠭⠟\n" + 
				"⠀⠀⠀⠀⢸⠀⠀⢀⡔⠒⠤⣤⠬⢦⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀\n" + 
				"⠀⠀⠀⠀⠈⠒⠓⠉⠀⠀⠀⠀⠉⠉⠑⠤⣔⣳⠄⠀⠀⠀⠀⠀⠀",new ArrayList<Attack>());
		attacks.add(new CoupDeQueue());
		attacks.add(new ViveAttaque());

	}

}
