package arenas;

import items.Potion;
import monsters.Balbizurre;
import monsters.Nictaloe;

public class Arena4 extends Arena{
    public Arena4() {
        super("Foret");
        monsters.add(new Balbizurre());
        monsters.add(new Balbizurre());
        monsters.add(new Nictaloe());
        actualMonster = monsters.get(0);
        MReward = monsters.get(2);
        IReward = new Potion();
    }
}