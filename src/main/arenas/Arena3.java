package arenas;

import items.Potion;
import monsters.Brindille;
import monsters.Cracupe;


public class Arena3 extends Arena{
    public Arena3() {
        super("Marée");
        monsters.add(new Brindille());
        monsters.add(new Cracupe());
        actualMonster = monsters.get(1);
        MReward = monsters.get(0);
        IReward = new Potion();
    }
}
