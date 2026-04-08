class LockRunner {

    public static void main(String[] args) {

        LockRun lockRun = new LockRun(3, "Godrej");

        lockRun.lockDetails();
        
        Lock lock = lockRun.details();
        lock.display();
    }
}