package tovicon;
import java.util.ArrayList;
import monsters.*;

public class Player {
    private String name;
    private int score;
    private ArrayList<Monster> monsters;
    private Monster selectedMonster;
    private int arena;

    public Player(String name, ArrayList<Monster> monsters) {
        this.name = name;
        this.score = 0;
        this.monsters = monsters;
        this.arena = 1;
        selectedMonster = new Poukicha();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public Monster getSelectedMonster() {
        return selectedMonster;
    }

    public void setSelectedMonster(Monster selectedMonster) {
        this.selectedMonster = selectedMonster;
    }

    public boolean addMonster(Monster monster) {
        if (monster != null) return monsters.add(monster);
        return false;
    }

    public boolean isDefeated(){
        boolean res = true;
        for(Monster i : monsters){
            if(i.getHealth() > 0){
                res = false;
            }
        }
        return res;
    }

    public String toString() {
        return name + ": Arène: " + arena + " - Score: " + score + " - Monstres: " + monsters;
    }
}
