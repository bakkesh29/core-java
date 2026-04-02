class LockerRunner {
    public static void main(String[] args) {

        Locker l1 = new Locker("Godrej", "Steel", "Grey", 15000, 80,
                "Home", "Digital", true, 5, "India");

        Locker l2 = new Locker("AmazonBasics", "Iron", "Black", 8000, 60,
                "Office", "Key", false, 2, "India");

        Locker l3 = new Locker("Yale", "Alloy", "White", 20000, 90,
                "Premium", "Biometric", true, 4, "USA");

        l1.show();
        l2.show();
        l3.show();
    }
}