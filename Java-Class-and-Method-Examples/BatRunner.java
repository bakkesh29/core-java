class BatRunner {

    public static void main(String[] value) {

        Bat.info();//static
        Bat b = new Bat();
        b.info();//non static
    }
}