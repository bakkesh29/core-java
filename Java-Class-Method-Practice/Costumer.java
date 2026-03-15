class Customer {
    void address() { System.out.println("Customer Address initiated."); }
}

class Address extends Customer {
    void info() { System.out.println("Fetching Address info..."); }
}

class Street extends Address {
    void details() { System.out.println("Street: 5th Avenue"); }
    void pincode() { System.out.println("Pincode: 10001"); }

    // Static method for Task 2 requirement
    static void displayTask2() {
        Street s = new Street();
        s.address();
        s.info();
        s.details();
        s.pincode();
    }
}