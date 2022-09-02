package main.monsters;

import java.util.ArrayList;

import main.attacks.CoupDeQueue;
import main.attacks.Uppercut;
import main.tovicon.Attack;
import main.tovicon.Monster;

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
