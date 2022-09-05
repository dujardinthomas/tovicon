package items;

public class SuperPotion extends Items {

	public final int PV= 60;
	public final String NAME="Super potion de soin";
	public final String DESCRIPTION = "Permet de redonner 60 points de vie à ton monstre.";
	
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
