package arenas;

import items.Potion;
import monsters.Balbizurre;
import monsters.Dracaufeu;


public class Arena4 extends Arena{
    public Arena4() {
        super("Foret");
        monsters.add(new Balbizurre());
        monsters.add(new Dracaufeu());
        actualMonster = monsters.get(1);
        MReward = monsters.get(2);
        IReward = new Potion();
    }
}