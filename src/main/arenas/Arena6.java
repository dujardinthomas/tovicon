package arenas;

import items.Potion;

import monsters.Mewtwo;

import monsters.Wem;

public class Arena6 extends Arena {
	public Arena6() {
		super("Place des Monstres");
        monsters.add(new Wem());
		monsters.add(new Mewtwo());
		actualMonster = monsters.get(0);
		MReward = monsters.get(1);
        IReward = new Potion();
	}
}
