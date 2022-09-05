package arenas;

import items.Potion;
import monsters.Riptencel;

public class Arena1 extends Arena {
    public Arena1() {
        super("Carnaval");
        monsters.add(new Riptencel());
        actualMonster = monsters.get(0);
        MReward = new Riptencel();
        IReward = new Potion();
    }
}
