package tovicon;
import java.util.ArrayList;

public class Arena {

    private ArrayList<Monster> monsters;
    private String name;
    
    public Arena(ArrayList<Monster> monsters, String name) {
    	this.monsters=monsters;
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
    
    

}