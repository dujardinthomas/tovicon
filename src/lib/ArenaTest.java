package lib;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tovicon.Arena;
import tovicon.Monster;

/**
 *  Cette classe permet de tester la classe Arena
 *  
 * @author DELERUE Clement
 * @version 02/09/2022
 */
@ExtendWith(MockitoExtension.class)
class ArenaTest {

	@Mock
	Monster monster1;
	@Mock
	Monster monster2;

	private Arena arenaTest;
	
	/**
	 * Ce test permet de tester le constructeur et les getteurs
	 */
	@Test
	@DisplayName("Test Constructeur, Getteurs")
	void testArena() {
		//GIVEN
		String name = "Arene 1" ;
		ArrayList<Monster> listemonster = new ArrayList<Monster>();
		
		//WHEN
		listemonster.add(monster1);
		arenaTest = new Arena(listemonster,name);
		ArrayList<Monster> listemonster2 = new ArrayList<Monster>();
		
		//THEN
			assertThat(arenaTest.getName()).isEqualTo(name);
			assertThat(arenaTest.getName()).isNotEqualTo("Clement");
			assertThat(arenaTest.getMonsters()).isEqualTo(listemonster);
			assertThat(arenaTest.getMonsters()).isNotEqualTo(listemonster2);
			
			
	}	
	
	/**
	 * Ce test permet de tester la methode isDefeated avec un r�sultat false
	 */
	@Test
	@DisplayName("Test methode isDefeated 1")
	void testIsDefeated1() {
		//GIVEN
		String name = "Arene 1" ;
		ArrayList<Monster> listemonster = new ArrayList<Monster>();
		
		//WHEN
		listemonster.add(monster1);
		listemonster.add(monster2);
		arenaTest = new Arena(listemonster,name);
		
		when(monster1.getHealth()).thenReturn(0);
		when(monster2.getHealth()).thenReturn(15);
		
		//THEN
		assertThat(arenaTest.isDefeated()).isEqualTo(false);	
	}	
	
	/**
	 * Ce test permet de tester la methode isDefeated avec un r�sultat true
	 */
	@Test
	@DisplayName("Test methode isDefeated 2")
	void testIsDefetead2() {
		//GIVEN
		String name = "Arene 1" ;
		ArrayList<Monster> listemonster = new ArrayList<Monster>();
		
		//WHEN
		listemonster.add(monster1);
		listemonster.add(monster2);
		arenaTest = new Arena(listemonster,name);
		
		when(monster1.getHealth()).thenReturn(0);
		when(monster2.getHealth()).thenReturn(0);
		
		//THEN
		assertThat(arenaTest.isDefeated()).isEqualTo(true);	
	}	
	
}
