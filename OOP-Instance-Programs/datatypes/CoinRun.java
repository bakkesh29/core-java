class CoinRun {

    void run(Coin coin) {
        if (coin != null) {
            coin.show();
        } else {
            System.out.println("Coin is null");
        }
    }
}