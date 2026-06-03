class Card {

	double size;
	String type;
	String material;
	int noOfCards;

	Card(double size, String type, String material, int noOfCards) {
		this.size = size;
		this.type = type;
		this.material = material;
		this.noOfCards = noOfCards;
	}

	void display() {
    System.out.println("Size : " + this.size);
    System.out.println("Type : " + this.type);
    System.out.println("Material : " + this.material);
    System.out.println("No Of Cards : " + this.noOfCards);
}
}