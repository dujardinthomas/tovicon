package arenas;

import items.Potion;
import monsters.Wem;

public class Arena3 extends Arena{
    public Arena3() {
        super("Croustiflex");
        monsters.add(new Wem());
        actualMonster = monsters.get(0);
        MReward = monsters.get(0);
        IReward = new Potion();
    }
}
