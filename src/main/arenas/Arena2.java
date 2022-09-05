package arenas;

import items.Potion;
import monsters.Poukicha;
import monsters.Riptencel;

public class Arena2 extends Arena {
    public Arena2() {
        super("Montagne");
        monsters.add(new Poukicha());
        actualMonster = monsters.get(0);
        MReward = new Riptencel();
        IReward = new Potion();
    }
}
