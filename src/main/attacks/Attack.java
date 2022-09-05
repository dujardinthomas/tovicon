package attacks;

public class Attack {
    private String nom;
    private int puissance ;
    
    public Attack (String name, int strength) {
    	this.nom = name	;
    	this.puissance = strength;
    }

	public String getNom() {
		return nom;
	}

	public int getPuissance() {
		return puissance;
	}

	@Override
	public String toString() {
		return nom + " - " + puissance;
	}

}
