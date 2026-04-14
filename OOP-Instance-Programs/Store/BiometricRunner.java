class BiometricRunner {
    public static void main(String[] args) {

        Biometric biometric = new Biometric();

        biometric.saveUser("User1");
        biometric.saveUser("User2");
        biometric.saveUser("User3");
        biometric.saveUser("User4");
        biometric.saveUser("User5");

        biometric.search("User3");
        biometric.search("User10");
    }
}