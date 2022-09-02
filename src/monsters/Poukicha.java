package monsters;

import attacks.CoupDeQueue;
import attacks.Uppercut;
import tovicon.Monster;

public class Poukicha extends Monster{
	
	static CoupDeQueue coupDeQueue ;
	static Uppercut uppercut;
	
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
				"     (_,'", coupDeQueue);
	}

	



}
