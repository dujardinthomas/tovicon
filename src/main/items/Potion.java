package items;

public class Potion extends Items{
	
	public final int PV= 30;
	public final String NAME="Potion de soin";
	public final String DESCRIPTION = "Permet de redonner 30 points de vie à ton monstre.";
	
	public String getName() {
		return NAME;
	}

	public String getDescription() {
		return DESCRIPTION;
	}

	public int getPV(){
		return PV;
	}
}