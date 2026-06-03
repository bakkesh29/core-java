class AllRunner {
    public static void main(String[] args) {

        //Instance creation

        // NOTEBOOK
        NoteBook noteBook1 = new NoteBook();
        noteBook1.display();
        NoteBook noteBook2 = new NoteBook();
        noteBook2.display();
        //ref hexadecimal
        System.out.println(noteBook2);

        // CLOCK
        Clock clock1 = new Clock();
        clock1.display();
        Clock clock2 = new Clock();
        clock2.display();
        System.out.println(clock2);

        // BANGLE
        Bangle bangle1 = new Bangle();
        bangle1.display();
        Bangle bangle2 = new Bangle();
        bangle2.display();
        System.out.println(bangle2);

        // ENGINE
        Engine engine1 = new Engine();
        engine1.display();
        Engine engine2 = new Engine();
        engine2.display();
        System.out.println(engine2);

        // MONITOR
        Monitor monitor1 = new Monitor();
        monitor1.display();
        Monitor monitor2 = new Monitor();
        monitor2.display();
        System.out.println(monitor2);

        // GENERATOR
        Generator generator1 = new Generator();
        generator1.display();
        Generator generator2 = new Generator();
        generator2.display();
        System.out.println(generator2);

        // ARDUINO
        Arduino arduino1 = new Arduino();
        arduino1.display();
        Arduino arduino2 = new Arduino();
        arduino2.display();
        System.out.println(arduino2);

        // SHAMPOO
        Shampoo shampoo1 = new Shampoo();
        shampoo1.display();
        Shampoo shampoo2 = new Shampoo();
        shampoo2.display();
        System.out.println(shampoo2);

        // IRON
        Iron iron1 = new Iron();
        iron1.display();
        Iron iron2 = new Iron();
        iron2.display();
        System.out.println(iron2);

        // STAND
        Stand stand1 = new Stand();
        stand1.display();
        Stand stand2 = new Stand();
        stand2.display();
        System.out.println(stand2);
    }
}