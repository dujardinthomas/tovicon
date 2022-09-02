import java.util.Scanner;

public class Main {
	public static String choix;
	public static void main(String[] args) throws Exception {
		start();
	}

	public static void start() {
		boolean choisi=false;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(!choisi) {
			System.out.println("Bonjour");
			System.out.println("Que veux tu faire ?");
			System.out.println("1. Jouer");
			System.out.println("2. Quitter");
			choix = scan.next();
			if(choix.equals("1")) {
				System.out.println("C'est parti !");
				choisi=true;
				play();
			}
			else if(choix.equals("2")){
				System.out.println("le jeu va s'arreter !");
				exit();
				choisi=true;
			}
			else {
				System.out.println("Je n'ai pas compris ton choix...\n");
			}
		}
	}
	
	public static void play() {
		//CODE DU JEU ICI

	}

	public static void exit() {
		//CODE DE FIN
		System.out.println("A bientot !");

	}


}