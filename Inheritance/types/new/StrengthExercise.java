class StrengthExercise extends Exercise {
    int sets;

    StrengthExercise(String name, String muscleGroup, int sets) {
        super(name, muscleGroup); // constructor chaining
        this.sets = sets;
    }

    void showSets() {
        System.out.println("Sets: " + sets);
    }
}