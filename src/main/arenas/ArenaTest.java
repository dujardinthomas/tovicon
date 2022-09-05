package arenas;

import org.junit.jupiter.api.Test;

import monsters.Monster;
import monsters.Poukicha;

import monsters.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

/**
 * Cette classe permet de tester la classe Arena
 * 
 * @author DELERUE Clement
 * @version 02/09/2022
 */
class ArenaTest {

	/**
	 * Ce test permet de tester le constructeur et les getteurs
	 */
	@Test
	void testArena() {
		// GIVEN
		String name = "Arene 1";
		ArrayList<Monster> listemonster = new ArrayList<Monster>();

		// WHEN
		listemonster.add(new Poukicha());
		Arena arenaTest = new Arena(name);
		arenaTest.setActualMonster(new Poukicha());

		// THEN
		assertEquals(name, arenaTest.getName());
		assertEquals(new Poukicha(), arenaTest.getActualMonster());
		assertEquals(true, arenaTest.isDefeated());
	}

}
