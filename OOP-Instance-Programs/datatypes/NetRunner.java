class NetRunner {

    public static void main(String[] args) {

        Net n1 = new Net();
        Net n2 = new Net("Fishing Net", "Nylon", 500);

        NetRun runner = new NetRun();

        runner.run(n1);
        runner.run(n2);
        runner.run(null);
    }
}