class LiftRunner {
    public static void main(String[] args) {

        Lift lift = new Lift();

        lift.saveLift("Ground");
        lift.saveLift("First");
        lift.saveLift("Second");
        lift.saveLift("Third");
        lift.saveLift("Fourth");

        lift.search("Second");
        lift.search("Tenth");
    }
}