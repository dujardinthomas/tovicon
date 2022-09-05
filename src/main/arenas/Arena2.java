package arenas;

import monsters.Poukicha;

public class Arena2 extends Arena {
    public Arena2() {
        super("Montagne");
        monsters.add(new Poukicha());
        actualMonster = monsters.get(0);
    }
}
