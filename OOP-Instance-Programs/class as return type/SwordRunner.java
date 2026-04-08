class SwordRunner {
    public static void main(String[] args) {

        SwordRun swordRun = new SwordRun("Warrior", 1000);
        swordRun.swordDetails();

        Sword s = swordRun.details();
        s.display();
    }
}