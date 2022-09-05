package tovicon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import monsters.Poukicha;

import monsters.Monster;


/**
 * Cette classe permet de tester la classe Player
 * 
 * @author DELERUE Clement
 * @version 02/09/2022
 */

class PlayerTest {

	/**
	 * Ce test permet de tester le constructeur et les getteurs
	 */
	@Test
	void testConstructeurGetteurs() {
		// GIVEN
		String pseudo = "Clement";
		ArrayList<Monster> listemonster = new ArrayList<Monster>();

		// WHEN
		listemonster.add(new Poukicha());
		Player playerTest = new Player(pseudo, listemonster);

		// THEN
		assertEquals(pseudo, playerTest.getName());
		assertEquals(0, playerTest.getScore());
		assertEquals(1, playerTest.getMonsters().size());
		assertEquals(new Poukicha(), playerTest.getMonsters().get(0));

	}

	@Test

	void testSetScore() {
		// GIVEN
		String pseudo = "Clement";
		ArrayList<Monster> listemonster = new ArrayList<Monster>();

		// WHEN
		listemonster.add(new Poukicha());
		Player playerTest = new Player(pseudo, listemonster);
		playerTest.setScore(30);

		// THEN
		assertEquals(30, playerTest.getScore());
	}

	@Test
	void testSetActualMonster() {
		// GIVEN
		String pseudo = "Clement";
		ArrayList<Monster> listemonster = new ArrayList<Monster>();

		// WHEN
		listemonster.add(new Poukicha());
		Player playerTest = new Player(pseudo, listemonster);
		playerTest.setActualMonster(new Poukicha());

		// THEN
		assertEquals(new Poukicha(), playerTest.getActualMonster());
	}
	
	@Test
	void testHeal() {
		// GIVEN
		String pseudo = "Clement";
		ArrayList<Monster> listemonster = new ArrayList<Monster>();

		// WHEN
		listemonster.add(new Poukicha());
		Player playerTest = new Player(pseudo, listemonster);
		playerTest.addMonster(new Poukicha());
		playerTest.healMonsters();
		
		// THEN
		assertEquals(new Poukicha(), playerTest.getActualMonster());
		assertEquals(100, playerTest.getActualMonster().getHealth());
		assertEquals(false, playerTest.isDefeated());
	}

}