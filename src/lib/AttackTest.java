package tovicon;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *  Cette classe permet de tester la classe Attack
 *  
 * @author DELERUE Clement
 * @version 02/09/2022
 */
class AttackTest {
private Attack attackTest;
	
	/**
	 * Cette méthode permet d'initialiser une nouvelle attaque avant chaque test
	 */
	@BeforeEach
	public void initAttackTest() {
		//GIVEN
		String nom = "Boule de feu" ;
		int puissance = 15;
		
		//WHEN
		attackTest = new Attack(nom, puissance);
	}
	
	/**
	 * Cette méthode permet de rendre invalide l'attaque utilisé pour le test
	 */
	@AfterEach
	public void invalideMonsterTest() {
		attackTest = null;
	}
	
	/**
	 * Ce test permet de tester le constructeur d'Attack et les getteurs 
	 */
	@Test
	@DisplayName("Test Constructeur et Getteur d'Attack")
	void testCommercial() {
		//THEN
			assertThat(attackTest.getNom()).isEqualTo("Boule de feu");
			assertThat(attackTest.getPuissance()).isEqualTo(15);
			assertThat(attackTest.getNom()).isNotEqualTo("Slaut");
			assertThat(attackTest.getPuissance()).isNotEqualTo(14);
	}	

}
