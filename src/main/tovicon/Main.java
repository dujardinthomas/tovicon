package tovicon;
import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	
	public static void main(String[] args){
		scanner = new Scanner(System.in);
		try {
            choix();
        } catch (WrongTapeException e) {
            e.printStackTrace();
        }
	}


	public static void choix() throws WrongTapeException{
		System.out.println("d888888b  .d88b.  db    db d888888b  .o88b.  .d88b.  d8b   db \n" +
						   "`~~88~~' .8P  Y8. 88    88   `88'   d8P  Y8 .8P  Y8. 888o  88 \n" +
						   "   88    88    88 Y8    8P    88    8P      88    88 88V8o 88 \n" +
						   "   88    88    88 `8b  d8'    88    8b      88    88 88 V8o88 \n" +
						   "   88    `8b  d8'  `8bd8'    .88.   Y8b  d8 `8b  d8' 88  V888 \n" +
						   "   YP     `Y88P'     YP    Y888888P  `Y88P'  `Y88P'  VP   V8P \n\n\n\n");
		String choix;
		System.out.println("Pour commencer à jouer entre 1, Pour quitter entre 2 :");
		choix = scanner.next();
		if(choix.equals("1")){
			System.out.println("C'est parti !");
			play();
		}else if(choix.equals("2")){
			System.out.println("le jeu va s'arreter !");
			System.out.println("A bientot !");
			scanner.close();
			System.exit(0);
		}else{
			throw new WrongTapeException();
		}
	}
	
	public static void play() {
		//CODE DU JEU ICI
		Game game = new Game();
		game.start();
	}
}