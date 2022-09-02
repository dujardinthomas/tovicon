package main.tovicon;
import java.util.ArrayList;

public class Arena {

    private ArrayList<Monster> monsters;
    private String name;
    private Monster actualMonster;
    
    public Arena(ArrayList<Monster> monsters, String name) {
    	this.monsters=monsters;
    	this.name=name;
        actualMonster = monsters.get(0);
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
}