package tovicon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import arenas.Arena;
import arenas.Arena1;
import arenas.Arena2;
import arenas.Arena3;
import arenas.Arena4;
import arenas.Arena5;
import arenas.Arena6;
import attacks.Attack;
import items.Items;
import monsters.Balbizurre;
import monsters.Monster;
import monsters.Poukicha;
import monsters.Riptencel;

public class Game {
	private static String myPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "csv" + File.separator;
	private static String myFile = "scores.csv";
	private Player player;
	private ArrayList<Arena> arenas;
	Scanner scanner = new Scanner(System.in);

	public Game() {
		arenas = new ArrayList<>();
		arenas.add(new Arena1());
		arenas.add(new Arena2());
		arenas.add(new Arena3());
		arenas.add(new Arena4());
		arenas.add(new Arena5());
		arenas.add(new Arena6());
	}

	public void start() {
		Utils.clearScreen();

		String name = chooseName();

		Utils.clearScreen();

		ArrayList<Monster> playerMonsters = new ArrayList<>();
		playerMonsters.add(chooseMonster());

		Utils.clearScreen();

		player = new Player(name, playerMonsters);

		for (Arena arena : arenas) {
			playTurnByTurn(arena, player);
			player.healMonsters();
		}
	}

	private String chooseName() {
		String name = "Unknown";

		System.out.println("Quel est ton nom :");
		name = scanner.next();
		return name;
	}

	private Monster chooseMonster() {
		Monster monster1 = new Poukicha();
		Monster monster2 = new Riptencel();
		Monster monster3 = new Balbizurre();

		boolean found = false;
		Monster monsterToReturn = null;

		System.out.println("1. " + monster1.getName());
		monster1.printRepresentation();
		System.out.println("2. " + monster2.getName());
		monster2.printRepresentation();
		System.out.println("3. " + monster3.getName());
		monster3.printRepresentation();

		while (!found) {

			System.out.print("Choisi un monstre :");
			String answer = scanner.next();

			switch (answer) {
			case "1":
				found = true;
				monsterToReturn = monster1;
				break;
			case "2":
				found = true;
				monsterToReturn = monster2;
				break;
			case "3":
				found = true;
				monsterToReturn = monster3;
				break;
			default:
				System.out.println("Veuillez choisir un monstre valable.");
				break;
			}
		}
		return monsterToReturn;
	}

	private boolean playTurnByTurn(Arena arena, Player player) {
		System.out.println("Bienvenue dans l'arène " + arena.getName() + ", préparez-vous !");

		Utils.waitForInput(scanner);
		Utils.clearScreen();

		//System.out.println(player.getActualMonster().getName() + " contre " + arena.getActualMonster().getName());
		System.out.println(player.getName() + " appelle " + player.getActualMonster().getName() + " !\n");
		System.out.println(arena.getName() + " appelle " + arena.getActualMonster().getName() + " !\n");

		Utils.waitForInput(scanner);
		Utils.clearScreen();

		while (!arena.isDefeated() && !player.isDefeated()) {
			
			printMonstersFight(player, arena);

			if (player.getActualMonster().getHealth() <= 0) {
				try {
					changeMonster(player);
					player.setScore(player.getScore() - 30);
					Utils.clearScreen();
					printMonstersFight(player, arena);
				}
				catch (WrongTapeException exception) { System.out.println(exception); }
			}

			System.out.println("C'est au tour de " + player.getName());

			Utils.waitForInput(scanner);
			Utils.clearScreen();

			printMonstersFight(player, arena);

			printMenuFight(player,arena);

			Utils.clearScreen();

			printMonstersFight(player, arena);

			System.out.println("Il reste " + Colors.TEXT_GREEN + arena.getActualMonster().getHealth() + Colors.TEXT_RESET + " pv à " + arena.getActualMonster().getName() + "\n");
			System.out.println("Il reste " + Colors.TEXT_CYAN + arena.getActualMonster().getShield() + Colors.TEXT_RESET + " de bouclier à " + arena.getActualMonster().getName() + "\n");

			Utils.waitForInput(scanner);
			Utils.clearScreen();

			if (!arena.isDefeated()) {
				if (arena.getActualMonster().getHealth() <= 0) {
					changeRandomMonster(arena);
				}

				printMonstersFight(player, arena);

				System.out.println("C'est au tour de " + arena.getName());

				Utils.waitForInput(scanner);
				Utils.clearScreen();

				printMonstersFight(player, arena);

				chooseRandomOptionToFight(player, arena);

				Utils.waitForInput(scanner);
				Utils.clearScreen();

				printMonstersFight(player, arena);

				System.out.println("Il reste " + Colors.TEXT_GREEN + player.getActualMonster().getHealth() + Colors.TEXT_RESET + " pv à "+ player.getActualMonster().getName() + "\n");
				System.out.println("Il reste " + Colors.TEXT_CYAN + player.getActualMonster().getShield() + Colors.TEXT_RESET + " de bouclier à " + player.getActualMonster().getName() + "\n");

				Utils.waitForInput(scanner);
				Utils.clearScreen();
			} else {
				player.setScore(player.getScore() + 50);
			}



			// joueur1 sélectionne attaque
			// texte attaque (machin utilise machin)
			// joueur1 attaque (perd vie)
			// if (player.getActualMonster().getHealth() <= 0) {
			// 	try {
			// 		changeMonster(player);
			// 		player.setScore(player.getScore() - 30);
			// 		Utils.clearScreen();
			// 	}
			// 	catch (WrongTapeException exception) { System.out.println(exception); }
			// }

			// System.out.println("C'est au tour de " + player.getName());
			// //System.out.println(player.getActualMonster());
			// player.getActualMonster().printHealth();
			// player.getActualMonster().printShield();
			// player.getActualMonster().printRepresentation();

			// printMenuFight(player,arena);

			// System.out.println("Il reste " + Colors.TEXT_GREEN + arena.getActualMonster().getHealth() + Colors.TEXT_RESET + " pv à " + arena.getActualMonster().getName() + "\n");
			// System.out.println("Il reste " + Colors.TEXT_CYAN + arena.getActualMonster().getShield() + Colors.TEXT_RESET + " de bouclier à " + arena.getActualMonster().getName() + "\n");
			// //System.out.println(arena.getActualMonster());
			// arena.getActualMonster().printHealth();
			// arena.getActualMonster().printShield();
			// arena.getActualMonster().printRepresentation();

			// Utils.waitForInput(scanner);
			// Utils.clearScreen();
			// joueur2 sélectionne attaque
			// texte attaque (machin utilise machin)
			// joueur2 attaque (perd vie)
			// if (!arena.isDefeated()) {
			// 	if (arena.getActualMonster().getHealth() <= 0) {
			// 		changeRandomMonster(arena);
			// 	}
			// 	System.out.println("C'est au tour de " + arena.getName());
			// 	//System.out.println(arena.getActualMonster());
			// 	arena.getActualMonster().printHealth();
			// 	arena.getActualMonster().printShield();
			// 	arena.getActualMonster().printRepresentation();

            //     Utils.waitForInput(scanner);
            //     Utils.clearScreen();

			// 	//arena.getActualMonster().attack(selectRandomAttackFrom(arena.getActualMonster()),player.getActualMonster());
			// 	chooseRandomOptionToFight(player, arena);

			// 	System.out.println("Il reste " + Colors.TEXT_GREEN + player.getActualMonster().getHealth() + Colors.TEXT_RESET + " pv à "+ player.getActualMonster().getName() + "\n");
			// 	System.out.println("Il reste " + Colors.TEXT_CYAN + player.getActualMonster().getShield() + Colors.TEXT_RESET + " de bouclier à " + player.getActualMonster().getName() + "\n");
			// 	//System.out.println(player.getActualMonster());
			// 	player.getActualMonster().printHealth();
			// 	player.getActualMonster().printShield();
			// 	player.getActualMonster().printRepresentation();

			// 	Utils.waitForInput(scanner);
			// 	Utils.clearScreen();
			// }
			// else{
			// 	player.setScore(player.getScore() + 50);
			// } // TODO si montre.health = 10-20 alors set health to 0
		}

		boolean win = false;

		if (!arena.isDefeated() && player.isDefeated()) {
			player.setScore(player.getScore()-30);
			System.out.println("Vous avez perdu.");
			printAndSaveScore();
			Utils.waitForInput(scanner);
		} 

		else if (!player.isDefeated() && arena.isDefeated()) {
			System.out.println("Vous avez gagné.");

			Utils.waitForInput(scanner);
			Utils.clearScreen();

			player.getReward(arena);
			win = true;
			Utils.waitForInput(scanner);
		} 

		else {
			System.out.println("That should not happend.");
		}

		return win;
	}

	private void printMonstersFight(Player player, Arena arena) {
		arena.getActualMonster().printHealth();
		arena.getActualMonster().printShield();
		arena.getActualMonster().printRepresentation();

		System.out.println("\n\n\n\n");

		player.getActualMonster().printHealth();
		player.getActualMonster().printShield();
		player.getActualMonster().printRepresentation();
		System.out.println("\n\n");
	}

	private Attack selectAttackFrom(Monster monster, Arena arena) {
        printMonstersFight(player, arena);

		System.out.println("Nom de l'attaque - Puissance de l'attaque\n");

		for (int i = 0; i < monster.getAttacks().size(); i++) {
			Attack attack = monster.getAttacks().get(i);
			System.out.println((i+1) + ") " + attack.getNom() + " - " + attack.getPuissance() + "\n");
		}

		int selection = -1;
		while (selection == -1) {
			try {
                System.out.println("Veuillez choisir une attaque");
				selection = Integer.parseInt(scanner.next());
				if (selection <= 0 || selection > monster.getAttacks().size()) {
					System.out.println("Veuillez choisir une attaque parmis celles disponibles.");
					selection = -1;
				}
			} catch (NumberFormatException eNumberFormatException) {
				System.out.println("Veuillez choisir une attaque parmis celles disponibles.");
				selection = -1;
			}
		}

		return monster.getAttacks().get(selection - 1);
	}

	private Attack selectRandomAttackFrom(Monster monster, Arena arena) {
		return monster.getAttacks().get(Utils.random(0, monster.getAttacks().size()));
	}

	private void changeMonster(Player player) throws WrongTapeException {
		String choix;
		System.out.println("\nSélectionne ton nouveau  monstre :");
		for (int i = 0; i < player.getMonsters().size(); i++) {
			if (player.getMonsters().get(i).getHealth() > 0) {
				System.out.println("\n" + (i + 1) + " : " + player.getMonsters().get(i).getName());
			}
		}
		choix = scanner.next();

		if (Integer.parseInt(choix) < 1 || Integer.parseInt(choix) > player.getMonsters().size()) {
			throw new WrongTapeException();
		} else {
			player.setActualMonster(player.getMonsters().get(Integer.parseInt(choix) - 1));
		}
	}

	private void changeRandomMonster(Arena arena) {
		ArrayList<Monster> monstersNotDead = new ArrayList<>();
		for (Monster monster : arena.getMonsters()) {
			if (monster.getHealth() > 0) {
				monstersNotDead.add(monster);
			}
		}
		Monster monster = monstersNotDead.get(Utils.random(0, monstersNotDead.size()));
		arena.setActualMonster(monster);
		//System.out.println(arena.getName() + " a changé de monsre pour " + monster.getName());
	}

	public Items selectItems(){

		if(player.getBag().size()>0){
			System.out.println("Quel objet veux-tu utiliser ?");
			System.out.println("Pour ne pas utiliser d'objet et attaquer entre 'Non' ");
			player.printBag();
			String obj = scanner.next();
			obj.toLowerCase();
			if(obj.equals("non")){
				return null;
			}else if(Integer.parseInt(obj)>0 && Integer.parseInt(obj)<= player.getBag().size()){
				player.setScore(player.getScore()-20);
				return player.getBag().get(Integer.parseInt(obj)-1);
			}else{
				System.out.println(" Je n'ai pas compris \n");
				selectItems();
			}
			
			

		}return null;
	}

	public boolean playItems(Items item){
		boolean res = false;
		if(item!=null){
			Utils.clearScreen();
			System.out.println("Tu utilises "+ item.getName() +" :\n");
			System.out.println(item.getDescription());
			int i=player.getActualMonster().getHealth();
			if(i+item.getPV() < player.getActualMonster().getMaxHealth()){
				player.getActualMonster().setHealth(i + item.getPV());
			}else{
				player.getActualMonster().setHealth(player.getActualMonster().getMaxHealth());
			}
			System.out.println( player.getActualMonster().getName() + " a maintenant : " +player.getActualMonster().getHealth() + " PV \n" );
			player.getBag().remove(item);
			res = true;
		}else {
			System.out.println("Le sac est vide");
		}
		return res;
	}

	public void printMenuFight(Player player, Arena arena) {
		String[] tab = new String[] {"Attaquer","Défendre","Sac","Fuir"};
		for (int i = 0; i < tab.length;i ++) {
			System.out.println((i+1) +". " + tab[i]);
		}
		String choice = "-1";
		
		while(choice.equals("-1")) {
			choice = scanner.next();
			switch(choice) {
				case "1" :
					Utils.clearScreen();
					player.getActualMonster().attack(selectAttackFrom(player.getActualMonster(), arena), arena.getActualMonster());
					break;
				case "2" :
					Utils.clearScreen();
					player.getActualMonster().setState(State.DEFENSE);
					System.out.println(arena.getName() + " a choisi de défendre.");
					break;
				case "3" :
					if(!playItems(selectItems())) {
						choice = "-1";
					}
					for (int i = 0; i < tab.length;i ++) {
						System.out.println((i+1) +". " + tab[i]);
					}
					break;
				case "4" :
					Utils.clearScreen();
					System.out.println("Le jeu va s'arreter !");
					printAndSaveScore();
					System.out.println("A bientot !");
					try {
						readAndPrintScoreBoard();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					scanner.close();
					System.exit(0);
					break;
				default :
					choice = "-1";
					System.out.println("Choisis un des 4 choix !");
			}
		}
	}

	public void chooseRandomOptionToFight(Player player, Arena arena) {
		int choice = Utils.random(1, 4);
		if (choice >= 1 && choice <=2) {
			arena.getActualMonster().attack(selectRandomAttackFrom(arena.getActualMonster(), arena), player.getActualMonster());
		} else {
			arena.getActualMonster().setState(State.DEFENSE);
			System.out.println(arena.getName() + " a choisi de défendre.\n");
		}
	}

	private void printAndSaveScore() {
		System.out.println(" SCORE  : "+ player.getScore() + " !\n");

		try {
			FileWriter csvWriter = new FileWriter(myPath + myFile);
			String[] HEADER = new String[] {"Name", ",", "Score"};
			for (String header : HEADER) {
				csvWriter.append(header);
			}
			csvWriter.append("\n");
			csvWriter.append(player.getName() + "," + player.getScore());
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException exception) { }
	}
	
	public void readAndPrintScoreBoard() throws FileNotFoundException{

		File getCSVFiles = new File(myPath + myFile);
		Scanner sc = new Scanner(getCSVFiles);
		sc.useDelimiter(",");
		System.out.println();

		while (sc.hasNext())
		{
			System.out.print(sc.next() + " | ");
		}
		sc.close();  

	}
}
