package monsters;

import java.util.ArrayList;

import attacks.Attack;
import tovicon.Colors;
import tovicon.Utils;
import tovicon.State;

public class Monster {
    private String name;
    private String representation;
    private final int maxHealth = 100;
    private int health = 100;
    private final int maxShield = 35;
    private int shield = 35;
    private static final int nbMaxAttacks = 4;
    protected ArrayList<Attack> attacks;
    private State state;
   

    public Monster(String name, String representation, ArrayList<Attack> attacks) {
        this.name = name;
        this.representation = representation;
        this.attacks = attacks;
        state = State.NORMAL;
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

    public ArrayList<Attack>  getAttacks() {
        return attacks;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getMaxShield() {
        return maxShield;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean addAttack(Attack attack) {
        if (attacks.size() >= nbMaxAttacks)
            return false;
        return attacks.add(attack);
    }

    public void attack(Attack atq, Monster ennemy) {
        //Utils.clearScreen();
        System.out.println(name + " utilise " + atq.getNom() + " !\n");
        if (ennemy.getState() == State.DEFENSE) {
            if (atq.getPuissance() > ennemy.getShield()) {
                ennemy.setHealth(ennemy.getHealth() - (atq.getPuissance() - ennemy.getShield()));
                ennemy.setShield(0);
            } else {
                ennemy.setShield(ennemy.getShield() - atq.getPuissance());
            }
            ennemy.setState(State.NORMAL);
        } else {
            ennemy.setHealth(ennemy.getHealth() - atq.getPuissance());
        }
    }

    public void printAttacks() {
        String res = "Attaques: ";
        for (int i = 0; i < attacks.size(); i++) {
            res += "\n" + (i + 1) + ") " + attacks.get(i);
        }

        System.out.println(res + "\n");
    }

    public void printHealth() {
        String res = "Vie: " + Colors.TEXT_GREEN;
        for (int i = 0; i < health / 5; i++) {
            res += "=";
        }
        res += Colors.TEXT_RED;
        for (int i = 0; i < maxHealth / 5 - health / 5; i++) {
            res += "=";
        }
        System.out.println(res + Colors.TEXT_RESET);
    }

    public void printShield() {
        String res = "Shield: " + Colors.TEXT_CYAN;
        for (int i = 0; i < shield / 2; i++) {
            res += "=";
        }
        res += Colors.TEXT_RED;
        for (int i = 0; i < maxShield / 2 - shield / 2; i++) {
            res += "=";
        }
        System.out.println(res + Colors.TEXT_RESET);
    }

    public void printRepresentation() {
        System.out.println(Colors.TEXT_YELLOW + representation + Colors.TEXT_RESET);
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
        String res = "Nom: " + name + " - Vie: " + health;
        return res;
    }
}
