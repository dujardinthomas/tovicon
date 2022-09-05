package arenas;

import items.Potion;

import monsters.Sablette;
import monsters.Tenefix;


public class Arena5 extends Arena {
	public Arena5() {
        super("Temple");
        monsters.add(new Sablette());
        monsters.add(new Tenefix());
        actualMonster = monsters.get(0);
        MReward = monsters.get(1);
        IReward = new Potion();
    }
}
