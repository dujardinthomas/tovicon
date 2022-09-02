package tovicon;
import java.util.ArrayList;
import java.util.Scanner;

import attacks.Uppercut;

public class Main {
	
	private static Player player;
	
	public static void main(String[] args){
		// try {
        //     choix();
        // } catch (WrongTapeException e) {
        //     e.printStackTrace();
        // }
		ArrayList<Monster> t= new ArrayList<>();
		t.add(new Monster("encore", "representation", new Attack("atta", 10)));
		Player player = new Player("audrey", t);
		player.addMonster(new Monster("blba","zd" , new Uppercut("up", 10)));
		try {
			changeMonster();
		} catch (WrongTapeException e) {
			e.printStackTrace();
		}
	}


	public static void choix() throws WrongTapeException{
		String choix;
		System.out.println("Pour commencer à jouer entre 1, Pour quitter entre 2 :");
		Scanner scan = new Scanner(System.in);
		choix = scan.next();
		if(choix.equals("1")){
			System.out.println("C'est parti !");
			play();
		}else if(choix.equals("2")){
			System.out.println("le jeu va s'arreter !");
			System.out.println("A bientot !");
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
	
	public static void changeMonster() throws WrongTapeException{
		String choix;
		System.out.println("Sélectionne ton nouveau  monstre :");


		for(int i = 0; i < player.getMonsters().size(); i++) {
			System.out.println("\n"+ i+1 + " :" + player.getMonsters().get(i).getName());
		}
		Scanner scan = new Scanner(System.in);
		choix = scan.next();
		if(Integer.parseInt(choix)< 1 || Integer.parseInt(choix)< player.getMonsters().size()) {
			throw new WrongTapeException();
		}else {
			player.setSelectedMonster(player.getMonsters().get(Integer.parseInt(choix)));
		}
	}

}