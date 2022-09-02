package tovicon;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *  Cette classe permet de tester la classe Monster
 *  
 * @author DELERUE Clement
 * @version 02/09/2022
 */
class MonsterTest {
	private Monster monsterTest;
	
	/**
	 * Ce test permet de tester le constructeur et les getteurs
	 */
	@Test
	@DisplayName("Test Constructeur et Getteur")
	void testMonster() {
		//GIVEN
		String name = "Poukicha" ;
		String representation = "MonstreR";
		Attack attacks= new Attack("CoupDeQueue",10);
		Attack attacksTest = new Attack("CoupDePoing",5);
		
		//WHEN
		monsterTest = new Monster(name,representation,attacks);
		
		//THEN
		assertThat(monsterTest.getName()).isEqualTo(name);
		assertThat(monsterTest.getRepresentation()).isEqualTo(representation);
		assertThat(monsterTest.getHealth()).isEqualTo(100);
		assertThat(monsterTest.getAttacks()).isEqualTo(attacks);
		assertThat(monsterTest.getName()).isNotEqualTo("Test");
		assertThat(monsterTest.getRepresentation()).isNotEqualTo("Test");
		assertThat(monsterTest.getHealth()).isNotEqualTo(90);
		assertThat(monsterTest.getAttacks()).isNotEqualTo(attacksTest);	
	}	
	
	/**
	 * Ce test permet de tester les setteurs
	 */
	@Test
	@DisplayName("Test Setteurs")
	void testSetteur() {
		//GIVEN
		String name = "Poukicha" ;
		String representation = "MonstreR";
		Attack attacks= new Attack("CoupDeQueue",10);
		
		//WHEN
		monsterTest = new Monster(name,representation,attacks);
		monsterTest.setName("Monstre1");
		monsterTest.setRepresentation("m");
		monsterTest.setHealth(5);
		
		
		//THEN
		assertThat(monsterTest.getName()).isEqualTo("Monstre1");
		assertThat(monsterTest.getRepresentation()).isEqualTo("m");
		assertThat(monsterTest.getHealth()).isEqualTo(5);
		assertThat(monsterTest.getName()).isNotEqualTo(name);
		assertThat(monsterTest.getRepresentation()).isNotEqualTo(representation);
		assertThat(monsterTest.getHealth()).isNotEqualTo(100);
			
	}	
}
