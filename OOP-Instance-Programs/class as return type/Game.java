class Game{
	
	int playerCount;
	String gameTitle;
	
	Game(int playerCount, String gameTitle){
		this.playerCount = playerCount;
		this.gameTitle = gameTitle;
	}
	
	void display(){
		System.out.println("Player Count : " + this.playerCount);
		System.out.println("Game Title : " + this.gameTitle);
	}
	
	public Card details() {		
		Card card = new Card(3.3, "Playing Card", "Plastic", 52);
		return card;
	}

}