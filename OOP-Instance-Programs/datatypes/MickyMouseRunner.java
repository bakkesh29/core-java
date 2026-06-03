class MickeyMouseRunner {

    public static void main(String[] args) {

        MickeyMouse m1 = new MickeyMouse();
        MickeyMouse m2 = new MickeyMouse("Black", "Toy", 300);

        MickeyMouseRun runner = new MickeyMouseRun();

        runner.run(m1);
        runner.run(m2);
        runner.run(null);
    }
}