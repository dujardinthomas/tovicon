package items;

public abstract class Items {
	
	public abstract String getName();
	public abstract String getDescription();
	public abstract int getPV();
	
	@Override
	public String toString() {
		return "Objet: " + getName() + " - Description: " + getDescription();
	}
}
