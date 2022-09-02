package monsters;

import java.util.ArrayList;

import attacks.CoupDeQueue;
import attacks.Uppercut;
import tovicon.Attack;
import tovicon.Monster;

public class Poukicha extends Monster{
	
	static CoupDeQueue coupDeQueue ;
	static Uppercut uppercut;
	public static ArrayList<Attack> attaque;
	
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
				"     (_,'", attaque);
		
		Poukicha.attaque = new ArrayList<Attack>();
		attaque.add(coupDeQueue);
		attaque.add(uppercut);
	}
	
	

	



}
