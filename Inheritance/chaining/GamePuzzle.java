class GamePuzzle extends Puzzle {
    String theme;

    GamePuzzle(int pieces, String type, String theme) {
        super(pieces, type); // constructor chaining
        this.theme = theme;
        System.out.println("GamePuzzle constructor");
    }

    void display() {
        System.out.println("Pieces: " + pieces);
        System.out.println("Type: " + type);
        System.out.println("Theme: " + theme);
    }
}