package monsters;

import java.util.ArrayList;

import attacks.Attack;
import attacks.CoupDeQueue;
import attacks.PistoletEau;

public class Cracupe extends Monster {

	public Cracupe() {
		super("Cracupe", "         _,........__\r\n"
				+ "            ,-'            \"`-.\r\n"
				+ "          ,'                   `-.\r\n"
				+ "        ,'                        \\\r\n"
				+ "      ,'                           .\r\n"
				+ "      .'\\               ,\"\".       `\r\n"
				+ "     ._.'|             / |  `       \\\r\n"
				+ "     |   |            `-.'  ||       `.\r\n"
				+ "     |   |            '-._,'||       | \\\r\n"
				+ "     .`.,'             `..,'.'       , |`-.\r\n"
				+ "     l                       .'`.  _/  |   `.\r\n"
				+ "     `-.._'-   ,          _ _'   -\" \\  .     `\r\n"
				+ "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\r\n"
				+ ".'        `\"-..___      __,'\\          \\  \\     \\\r\n"
				+ "\\_ .          |   `\"\"\"\"'    `.           . \\     \\\r\n"
				+ "  `.          |              `.          |  .     L\r\n"
				+ "    `.        |`--...________.'.        j   |     |\r\n"
				+ "      `._    .'      |          `.     .|   ,     |\r\n"
				+ "         `--,\\       .            `7\"\"' |  ,      |\r\n"
				+ "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\r\n"
				+ "             \\ `.     .          /      |  '      |  ,'          `.\r\n"
				+ "              \\  v.__  .        '       .   \\    /| /              \\\r\n"
				+ "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\r\n"
				+ "                `        .        `._ ___,j.  `/ .-       ,---.     |\r\n"
				+ "                ,`-.      \\         .\"     `.  |/        j     `    |\r\n"
				+ "               /    `.     \\       /         \\ /         |     /    j\r\n"
				+ "              |       `-.   7-.._ .          |\"          '         /\r\n"
				+ "              |          `./_    `|          |            .     _,'\r\n"
				+ "              `.           / `----|          |-............`---'\r\n"
				+ "                \\          \\      |          |\r\n"
				+ "               ,'           )     `.         |\r\n"
				+ "                7____,,..--'      /          |\r\n"
				+ "                                  `---.__,--.'mh\r\n", new ArrayList<Attack>());
		attacks.add(new CoupDeQueue());
		attacks.add(new PistoletEau());
	}
}
