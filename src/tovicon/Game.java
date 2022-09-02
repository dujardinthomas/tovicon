package tovicon;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.monitor.MonitorSettingException;

public class Game {
    private Player player;
    private Arena arena;
    
    public void start() {
        String name = chooseName();
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(chooseMonster());

        player = new Player(name, monsters);
        System.out.println(player);
    }

    private String chooseName() {
        String name = "Unknown";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est ton nom :\n");
        name = scanner.next();
        return name;
    }

    private Monster chooseMonster() {
        Monster monster1 = new Monster("Michel", "michel", new Attack("Tape", 1));
        Monster monster2 = new Monster("Robert", "robert", new Attack("Balaye", 2));

        boolean found = false;
        Monster monsterToReturn = null;
        Scanner scanner = new Scanner(System.in);

        while (!found) {

            System.out.println("Choisi un monstre :\n");
            System.out.println(monster1 + "\n");
            System.out.println(monster2 + "\n");

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
}
