package tovicon;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *  Cette classe permet de tester la classe Player
 *  
 * @author DELERUE Clement
 * @version 02/09/2022
 */
@ExtendWith(MockitoExtension.class)
class PlayerTest {
	@Mock
	Monster monster1;
	@Mock
	Monster monster2;

	
private Player playerTest;

	/**
	*Ce test permet de tester le constructeur et les getteurs
 	*/
	@Test
	@DisplayName("Test Constructeur, Getteurs")
	void testPlayer() {
		//GIVEN
		String pseudo = "Clement" ;
		ArrayList<Monster> listemonster = new ArrayList<Monster>();
		
		//WHEN
		listemonster.add(monster1);
		playerTest = new Player(pseudo,listemonster);
		ArrayList<Monster> listemonster2 = new ArrayList<Monster>();
		
		//THEN
			assertThat(playerTest.getPseudo()).isEqualTo(pseudo);
			assertThat(playerTest.getScore()).isEqualTo(0);
			assertThat(playerTest.getlife()).isEqualTo(3);
			assertThat(playerTest.getPseudo()).isNotEqualTo("Lucas");
			assertThat(playerTest.getScore()).isNotEqualTo(1);
			assertThat(playerTest.getlife()).isNotEqualTo(2);
			assertThat(playerTest.getMonster()).isNotEqualTo(listemonster2);
			assertThat(playerTest.getMonster()).isEqualTo(listemonster);
			
			
	}
}
