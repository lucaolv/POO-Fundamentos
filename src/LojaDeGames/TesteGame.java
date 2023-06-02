package LojaDeGames;

public class TesteGame {

	public static void main(String[] args) {

		Produto game = new Produto("FIFA 23", "XBOX SERIES X", "Digital", 249.99, 7, 2);
		game.visualizar();
		
		Produto game2 = new Produto("Gof of War", "PLAYSTATION 5", "Física", 349.99, 7, 1);
		game2.visualizar();
		
	}

}
