class JuiceRunner {
    public static void main(String[] args) {

        Juice juice = new Juice();

        juice.saveJuice("Apple");
        juice.saveJuice("Mango");
        juice.saveJuice("Orange");
        juice.saveJuice("Grape");
        juice.saveJuice("Pineapple");

        juice.search("Mango");
        juice.search("Banana");
    }
}