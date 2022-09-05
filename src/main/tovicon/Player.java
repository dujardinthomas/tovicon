package tovicon;
import java.util.ArrayList;

import arenas.Arena;
import items.Items;
import items.Potion;
import monsters.*;

public class Player {
    private String name;
    private int score;
    private ArrayList<Monster> monsters;
    private Monster actualMonster;
    private int arena;
    private ArrayList<Items> bag; 

    public Player(String name, ArrayList<Monster> monsters) {
        this.name = name;
        this.score = 0;
        this.monsters = monsters;
        this.arena = 1;
        bag = new ArrayList<>();
        bag.add(new Potion());
        if (monsters.get(0) != null) 
            actualMonster = monsters.get(0);
        else 
            actualMonster = new Poukicha();
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

    public Monster getActualMonster() {
        return actualMonster;
    }

    public void setActualMonster(Monster actualMonster) {
        this.actualMonster = actualMonster;
    }

    public boolean addMonster(Monster monster) {
        if (monster != null) return monsters.add(monster);
        return false;
    }

    public boolean isDefeated() {
        boolean res = true;
        for (Monster i : monsters) {
            if (i.getHealth() > 0) {
                res = false;
            }
        }
        return res;
    }

	public ArrayList<Items> getBag() {
		return bag;
	}
	
	public boolean addItem(Items item) {
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

    public void getReward(Arena arena) {
        addMonster(arena.getMReward());
        System.out.println("Vous avez obtenu un nouveau monstre ! " + arena.getMReward());
        addItem(arena.getIReward());
        System.out.println("Vous avez obtenu un nouvel objet ! " + arena.getIReward());
    }

    public void healMonsters() {
        for (Monster monster : monsters) {
            monster.setHealth(100);
        }
    }

    public String toString() {
        return name + ": Arène: " + arena + " - Score: " + score + " - Monstres: " + monsters;
    }
}
