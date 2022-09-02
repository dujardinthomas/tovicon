package monsters;

import java.util.ArrayList;

import attacks.CoupDeQueue;
import attacks.Uppercut;
import tovicon.Attack;
import tovicon.Monster;

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
		
		addAttack(new CoupDeQueue());
		addAttack(new Uppercut());
	}
	
	

	



}
