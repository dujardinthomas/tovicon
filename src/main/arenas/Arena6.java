package arenas;

import items.Potion;
import monsters.Ekelket;
import monsters.Reflonx;
import monsters.Riptencel;
import monsters.Wem;

public class Arena6 extends Arena {
	public Arena6() {
		super("Place des Monstres");
		monsters.add(new Riptencel());
        monsters.add(new Reflonx());
        monsters.add(new Wem());
		monsters.add(new Ekelket());
		actualMonster = monsters.get(0);
		MReward = monsters.get(3);
        IReward = new Potion();
	}
}
