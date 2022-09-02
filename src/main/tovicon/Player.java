package tovicon;
import java.util.ArrayList;

import items.Items;
import monsters.*;

public class Player {
    private String name;
    private int score;
    private ArrayList<Monster> monsters;
    private Monster selectedMonster;
    private int arena;
    private ArrayList<Items> bag; 

    public Player(String name, ArrayList<Monster> monsters) {
        this.name = name;
        this.score = 0;
        this.monsters = monsters;
        this.arena = 1;
        if (monsters.get(0) != null) selectedMonster = monsters.get(0);
        else selectedMonster = new Poukicha();
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

    public String toString() {
        return name + ": Arène: " + arena + " - Score: " + score + " - Monstres: " + monsters;
    }

	public ArrayList<Items> getBag() {
		return bag;
	}
	
	public boolean addItems(Items item) {
		if(item != null) return bag.add(item);
		return false;
	}
	
	public void printBag() {
		if(bag.size()<1) {
			System.out.println("Le sac est vide");
		}else {
			for(int i = 0; i<bag.size(); i++) {
				System.out.println("\n" + (i+1) +" "+ bag.get(i).getName());
			}
		}
	}
}
