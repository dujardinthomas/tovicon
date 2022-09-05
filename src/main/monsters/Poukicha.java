package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.CoupDeQueue;
import attacks.Uppercut;

public class Poukicha extends Monster{
	public Poukicha() {
		super("Poukicha", ""
				+ "`;-.          ___,\n" + 
				"  `.`\\_...._/`.-\"`\n" + 
				"    \\        /      ,\n" + 
				"    /()   () \\    .' `-._\n" + 
				"   |)  .    ()\\  /   _.'\n" + 
				"   \\  -'-     ,; '. <\n" + 
				"    ;.__     ,;|   > \\\n" + 
				"   / ,    / ,  |.-'.-'\n" + 
				"  (_/    (_/ ,;|.<`\n" + 
				"    \\    ,     ;-`\n" + 
				"     >   \\    /\n" + 
				"    (_,-'`> .'\n" + 
				"     (_,'", new ArrayList<Attack>());
		
		attacks.add(new CoupDeQueue());
		attacks.add(new Uppercut());
	}
}
