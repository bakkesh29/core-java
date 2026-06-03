class BurgerRunner {
    public static void main(String[] args) {

        BurgerRun burgerRun = new BurgerRun("Food Zone", 5);
        burgerRun.burgerDetails();

        Burger b = burgerRun.details();
        b.display();
    }
}