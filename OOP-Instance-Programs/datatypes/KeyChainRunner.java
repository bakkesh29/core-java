class KeychainRunner {
    public static void main(String[] args) {

        Keychain k1 = new Keychain();
        Keychain k2 = new Keychain("Heart", "Metal", 100);

        KeychainRun runner = new KeychainRun();

        runner.run(k1);
        runner.run(k2);
        runner.run(null);
    }
}