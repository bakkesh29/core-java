class CardRunner {
	
	public static void main(String[] args) {
		
		Game game = new Game(4, "Poker ");
		game.display();
		
		Card card = game.details();  
		card.display();
	}
}