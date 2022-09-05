package monsters;

import attacks.Attack;
import attacks.CoupDeQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Cette classe permet de tester la classe Monster
 * 
 * @author DELERUE Clement
 * @version 02/09/2022
 */
class MonsterTest {

	/**
	 * Ce test permet de tester le constructeur et les getteurs
	 */
	@Test
	void testMonster() {
		// GIVEN
		String name = "Poukicha";
		String representation = "MonstreR";
		ArrayList<Attack> listeAttack = new ArrayList<Attack>();

		// WHEN
		listeAttack.add(new CoupDeQueue());
		Monster monsterTest = new Monster(name, representation, listeAttack);
		monsterTest.addAttack(new CoupDeQueue());

		// THEN
		assertEquals("Poukicha", monsterTest.getName());
		assertEquals("MonstreR", monsterTest.getRepresentation());
		assertEquals(100, monsterTest.getHealth());
		assertEquals(new CoupDeQueue(), monsterTest.getAttacks());
		monsterTest = null;
	}

	/**
	 * Ce test permet de tester les setteurs
	 */
	@Test
	void testSetteur() {
		// GIVEN
		String name = "Poukicha";
		String representation = "MonstreR";
		ArrayList<Attack> listeAttack = new ArrayList<Attack>();

		// WHEN
		listeAttack.add(new CoupDeQueue());
		Monster monsterTest = new Monster(name, representation, listeAttack);
		monsterTest.addAttack(new CoupDeQueue());
		monsterTest.addAttack(new CoupDeQueue());
		monsterTest.addAttack(new CoupDeQueue());
		monsterTest.addAttack(new CoupDeQueue());
		monsterTest.addAttack(new CoupDeQueue());
		monsterTest.setName("Monstre1");
		monsterTest.setRepresentation("m");
		monsterTest.setHealth(5);

		// THEN
		assertEquals("Monstre1", monsterTest.getName());
		assertEquals("m", monsterTest.getRepresentation());
		assertEquals(5, monsterTest.getHealth());
		assertEquals(4, monsterTest.getAttacks().size());

		monsterTest = null;
	}
}
