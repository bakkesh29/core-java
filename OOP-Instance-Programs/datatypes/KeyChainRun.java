class KeychainRun {

    void run(Keychain keychain) {
        if (keychain != null) {
            keychain.show();
        } else {
            System.out.println("Keychain is null");
        }
    }
}