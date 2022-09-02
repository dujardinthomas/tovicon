import java.util.ArrayList;

public class Monster {
    private String name;
    private String representation;
    private int health = 100;
    private static final int nbMaxAttacks = 4;
    private ArrayList<Attack> attacks;

    public Monster(String name, String representation, ArrayList<Attack> attacks) {
        this.name = name;
        this.representation = representation;
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public boolean addAttack(Attack attack) {
        if (attacks.size() >= nbMaxAttacks)
            return false;
        return attacks.add(attack);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attacks == null) ? 0 : attacks.hashCode());
        result = prime * result + health;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((representation == null) ? 0 : representation.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Monster other = (Monster) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Monster [attacks=" + attacks + ", health=" + health + ", name=" + name + ", representation="
                + representation + "]";
    }
}
