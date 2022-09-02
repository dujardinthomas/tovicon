package tovicon;

import java.util.ArrayList;
import java.util.Scanner;

import monsters.Poukicha;
import monsters.riptencél;

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
        Monster monster1 = new Poukicha();
        Monster monster2 = new riptencél();

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

        System.out.println(player.getSelectedMonster().getName() + " contre " + arena.getActualMonster().getName());

        while (!arena.isDefeated() && !player.isDefeated()) {
            // joueur1 sélectionne attaque
            // texte attaque (machin utilise machin)
            // joueur1 attaque (perd vie)
            player.getSelectedMonster().attack(selectAttackFrom(player.getSelectedMonster()), arena.getActualMonster());
            System.out.println("Il reste " + player.getSelectedMonster().getHealth() + "pv à " + player.getSelectedMonster().getName() + "\n");
            // joueur2 sélectionne attaque
            // texte attaque (machin utilise machin)
            // joueur2 attaque (perd vie)
            arena.getActualMonster().attack(selectAttackFrom(arena.getActualMonster()), player.getSelectedMonster());
            System.out.println("Il reste " + arena.getActualMonster().getHealth() + "pv à " + arena.getActualMonster().getName() + "\n");
        }
    }

    private Attack selectAttackFrom(Monster monster) {
        System.out.println("Veuillez choisir une attaque\n");
        System.out.println("0) Nom de l'attaque - Puissance de l'attaque\n");

        for (int i = 0; i < monster.getAttacks().size(); i++) {
            Attack attack = monster.getAttacks().get(i);
            System.out.println((i+1) + ") " + attack.getNom() + " - " + attack.getPuissance() + "\n");
        }

        int selection = -1;
        while (selection == -1) {
            selection = Integer.parseInt(scanner.next());
            if (selection <= 0 || selection > monster.getAttacks().size()) {
                System.out.println("Veuillez choisir une attaque parmis celles disponibles.");
                selection = -1;
            }
        }

        return monster.getAttacks().get(selection - 1);
    }

    // private Attack selectRandomAttackFrom(Monster monster) {
    //     return new Attack("name", 1);
    // }
}
