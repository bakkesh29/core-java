class CupRunner {
    public static void main(String[] args) {

        // Cup → class
        // teaCup → reference variable
        // new Cup() → constructor creation

        // 5 instances
        Cup teaCup = new Cup();
        Cup coffeeCup = new Cup();
        Cup glassCup = new Cup();
        Cup plasticCup = new Cup();
        Cup travelCup = new Cup();

        System.out.println("\n--- Before Assigning Values ---\n");

        // Default values
        System.out.println(teaCup.material + " " + teaCup.color + " " + teaCup.price + " " + teaCup.size + " " + teaCup.isReusable);
        System.out.println(coffeeCup.material + " " + coffeeCup.color + " " + coffeeCup.price + " " + coffeeCup.size + " " + coffeeCup.isReusable);
        System.out.println(glassCup.material + " " + glassCup.color + " " + glassCup.price + " " + glassCup.size + " " + glassCup.isReusable);
        System.out.println(plasticCup.material + " " + plasticCup.color + " " + plasticCup.price + " " + plasticCup.size + " " + plasticCup.isReusable);
        System.out.println(travelCup.material + " " + travelCup.color + " " + travelCup.price + " " + travelCup.size + " " + travelCup.isReusable);

        // Assign values
        teaCup.material="Ceramic"; teaCup.color="White"; teaCup.price=100; teaCup.size="Small"; teaCup.isReusable=true;
        coffeeCup.material="Glass"; coffeeCup.color="Brown"; coffeeCup.price=150; coffeeCup.size="Medium"; coffeeCup.isReusable=true;
        glassCup.material="Glass"; glassCup.color="Transparent"; glassCup.price=120; glassCup.size="Large"; glassCup.isReusable=true;
        plasticCup.material="Plastic"; plasticCup.color="Blue"; plasticCup.price=50; plasticCup.size="Medium"; plasticCup.isReusable=false;
        travelCup.material="Steel"; travelCup.color="Black"; travelCup.price=300; travelCup.size="Large"; travelCup.isReusable=true;

        System.out.println("\n--- After Assigning Values ---\n");

        // Updated values
        System.out.println(teaCup.material + " " + teaCup.color + " " + teaCup.price + " " + teaCup.size + " " + teaCup.isReusable);
        System.out.println(coffeeCup.material + " " + coffeeCup.color + " " + coffeeCup.price + " " + coffeeCup.size + " " + coffeeCup.isReusable);
        System.out.println(glassCup.material + " " + glassCup.color + " " + glassCup.price + " " + glassCup.size + " " + glassCup.isReusable);
        System.out.println(plasticCup.material + " " + plasticCup.color + " " + plasticCup.price + " " + plasticCup.size + " " + plasticCup.isReusable);
        System.out.println(travelCup.material + " " + travelCup.color + " " + travelCup.price + " " + travelCup.size + " " + travelCup.isReusable);
    }
}