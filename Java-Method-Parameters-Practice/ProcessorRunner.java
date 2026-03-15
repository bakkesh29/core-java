public class ProcessorRunner {
    public static void main(String[] args) {
        // Explicit
        Processors.details(300, 64, 512);
        // Implicit
        int speed = 200;
        int gen = 10;
        int storage = 256;
        Processors.details(speed, gen, storage);
        if (speed >= 64 && gen >= 64 && storage >= 128) {
            System.out.println("valid processor details");
        } 
        else {
            System.out.println("Invalid processor details");
        }

    }

}