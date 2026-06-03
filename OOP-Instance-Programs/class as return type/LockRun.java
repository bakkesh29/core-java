class LockRun {

    int numberOfKeys;
    String brandName;

    LockRun(int numberOfKeys, String brandName) {
        this.numberOfKeys = numberOfKeys;
        this.brandName = brandName;
    }

    void lockDetails() {
        System.out.println("Number of Keys : " + this.numberOfKeys);
        System.out.println("Brand Name : " + this.brandName);
    }

    public Lock details() {
        Lock lock = new Lock("Door Lock", "Steel", 500);
        return lock;
    }
}
