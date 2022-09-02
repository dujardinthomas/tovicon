package tovicon;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Player player;
    private Arena arena;
    Scanner scanner = new Scanner(System.in);
    
    public void start() {
        String name = chooseName();
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(chooseMonster());

        player = new Player(name, monsters);
        
        arena = new Arena(monsters, name);

        playTurnByTurn(arena, player);
    }

    private String chooseName() {
        String name = "Unknown";

        System.out.println("Quel est ton nom :\n");
        name = scanner.next();
        return name;
    }

    private Monster chooseMonster() {
        Monster monster1 = new Monster("Michel", "michel", new Attack("Tape", 1));
        Monster monster2 = new Monster("Robert", "robert", new Attack("Balaye", 2));

        boolean found = false;
        Monster monsterToReturn = null;

        while (!found) {

            System.out.println("Choisi un monstre :\n");
            System.out.println("1. " + monster1 + "\n");
            System.out.println("2. " + monster2 + "\n");

            String answer = scanner.next();

            switch (answer) {
                    case "1":
                        found = true;
                        monsterToReturn = monster1;
                    case "2":
                        found = true;
                        monsterToReturn = monster2;
                    default:
                        break;
                }
        }
        return monsterToReturn;
    }

    private void playTurnByTurn(Arena arena, Player player) {
        System.out.println("Bienvenue dans l'arène " + arena.getName() + ", préparez-vous !");
        scanner.next();

        Monster actualMonster;
        Attack actualAttack;

        System.out.println(player.getSelectedMonster() + " contre " + arena.getActualMonster());

        while (!arena.isDefeated() && !player.isDefeated()) {
            // joueur1 sélectionne attaque
            actualMonster = player.getSelectedMonster();
            actualAttack = selectAttackFrom(actualMonster);
            // texte attaque (machin utilise machin)
            // joueur1 attaque (perd vie)
            actualMonster.attack(actualAttack, arena.getActualMonster());
            // joueur2 sélectionne attaque
            actualMonster = arena.getActualMonster();
            actualAttack = selectRandomAttackFrom(actualMonster);
            // texte attaque (machin utilise machin)
            // joueur2 attaque (perd vie)
            actualMonster.attack(actualAttack, player.getSelectedMonster());
        }
    }

    private Attack selectAttackFrom(Monster monster) {
        System.out.println("Veuillez choisir une attaque");
        System.out.println("1) " + monster.getAttacks());

        Attack attack;
        int selection = -1;
        while (selection == -1) {
            selection = Integer.parseInt(scanner.next());
            
        }

        return new Attack("name", 1);
    }

    private Attack selectRandomAttackFrom(Monster monster) {
        return new Attack("name", 1);
    }
}
