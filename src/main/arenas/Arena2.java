package arenas;

import items.Potion;
import monsters.Nictaloe;
import monsters.Reflonx;

public class Arena2 extends Arena {
    public Arena2() {
        super("Montagne");
        monsters.add(new Nictaloe());
        monsters.add(new Reflonx());
        actualMonster = monsters.get(0);
        MReward = monsters.get(1);
        IReward = new Potion();
    }
}
