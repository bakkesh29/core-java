class Exercise {
    String name;
    String muscleGroup;

    Exercise(String name, String muscleGroup) {
        this.name = name;
        this.muscleGroup = muscleGroup;
    }

    void display() {
        System.out.println("Exercise: " + name);
        System.out.println("Muscle Group: " + muscleGroup);
    }
}