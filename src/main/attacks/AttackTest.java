package attacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Cette classe permet de tester la classe Attack
 * 
 * @author DELERUE Clement
 * @version 02/09/2022
 */
class AttackTest {

	/**
	 * Ce test permet de tester le constructeur d'Attack et les getteurs
	 */
	@Test
	void testCommercial() {
		// GIVEN
		String nom = "Boule de feu";
		int puissance = 15;

		// WHEN
		Attack attackTest = new Attack(nom, puissance);
		
		// THEN
		assertEquals(nom, attackTest.getNom());
		assertEquals(puissance, attackTest.getPuissance());
	}

}
