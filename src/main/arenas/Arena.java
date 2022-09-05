package arenas;
import java.util.ArrayList;

import items.Items;
import monsters.Monster;

public class Arena {

    protected ArrayList<Monster> monsters;
    private String name;
    protected Monster actualMonster;
    protected Monster MReward;
    protected Items IReward;
    
    public Arena(String name) {
    	this.monsters = new ArrayList<>();
    	this.name=name;
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

    public String getName(){
        return this.name;
    }

    public ArrayList<Monster> getMonsters(){
        return this.monsters;
    }

    public Monster getActualMonster() {
        return actualMonster;
    }

    public void setActualMonster(Monster actualMonster) {
        this.actualMonster = actualMonster;
    }

    public Monster getMReward() {
        return MReward;
    }

    public Items getIReward() {
        return IReward;
    }

    @Override
    public String toString() {
        return "[" + name + "] " + "Monsters: " + monsters;
    }
}