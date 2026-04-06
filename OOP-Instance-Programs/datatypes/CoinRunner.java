class CoinRunner {

    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin("Rupee", "Steel", 1.0);

        CoinRun runner = new CoinRun();

        runner.run(coin1);   
        runner.run(coin2);   
        runner.run(null);   // null check
    }
}