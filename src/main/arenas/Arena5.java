package arenas;

import items.Potion;
import monsters.Cracupe;
import monsters.Ectaplasmo;
import monsters.Nictaloe;
import monsters.Reflonx;
import monsters.Riptencel;
import monsters.Wem;

public class Arena5 extends Arena {
	public Arena5() {
        super("Temple");
        monsters.add(new Riptencel());
        monsters.add(new Ectaplasmo());
        monsters.add(new Nictaloe());
        monsters.add(new Reflonx());
        monsters.add(new Wem());
        monsters.add(new Cracupe());
        actualMonster = monsters.get(0);
        MReward = monsters.get(5);
        IReward = new Potion();
    }
}
