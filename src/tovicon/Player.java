package tovicon;
import java.util.ArrayList;

public class Player {
    

    private String pseudo;
    private int score;
    private ArrayList<Monster> monster;
    // private ArrayList<Items> items;
    private int life;



  public Player(String pseudo, ArrayList<Monster> monster) {
        this.pseudo = pseudo;
        this.score = 0;
        this.monster = monster;
        this.life = 3;
    }


    public String getPseudo() {
        return pseudo;
    }



    public int getScore() {
        return score;
    }



    public ArrayList<Monster> getMonster() {
        return monster;
    }


    public int getlife() {
        return life;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (monster == null) {
            if (other.monster != null)
                return false;
        } else if (!monster.equals(other.monster))
            return false;
        if (pseudo == null) {
            if (other.pseudo != null)
                return false;
        } else if (!pseudo.equals(other.pseudo))
            return false;
        return true;
    }

    
    public String toString() {
        return "Player ["+pseudo +" have "+ life +"lives ,  score= " + score + " and " + monster +"]";
    }


    



}
