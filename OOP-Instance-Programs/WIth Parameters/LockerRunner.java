class LockerRunner {
    public static void main(String[] args) {

        Locker l1 = new Locker();
        l1.show();

        Locker l2 = new Locker("Godrej", "Steel");
        l2.show();

        Locker l3 = new Locker("Samsung", "Iron", 12000);
        l3.show();

        Locker l4 = new Locker("LG", "Alloy", 20000, 50);
        l4.show();

        Locker l5 = new Locker(l4);
        l5.show();
    }
}