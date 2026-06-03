class SandRunner {
    public static void main(String[] args) {

        SandRun sandRun = new SandRun("Beach", 500);
        sandRun.sandDetails();

        Sand s = sandRun.details();
        s.display();
    }
}