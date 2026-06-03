public class MainRunner6 {
    public static void main(String[] args) {
        GamePuzzle j1 = new GamePuzzle(500, "Medium", "Nature");
        GamePuzzle j2 = new GamePuzzle(1000, "Hard", "City");

        System.out.println("---- Puzzle Details ----");

        j1.display();
        System.out.println();

        j2.display();
    }
}
