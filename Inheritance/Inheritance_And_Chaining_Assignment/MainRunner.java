public class MainRunner {
    public static void main(String... values) {

        // paint with parameters
        WallPaint p1 = new WallPaint("Red");
        WallPaint p2 = new WallPaint("Blue");

        p1.start();
        p1.stop();
        p1.mix();
        p1.apply();
        p1.dry();
        p2.stop();
        System.out.println("-----------");

        // ups
        SmartUPS u1 = new SmartUPS(500);
        SmartUPS u2 = new SmartUPS(1000);

        u1.start();
        u1.stop();
        u1.charge();
        u1.backup();
        u1.shutdown();
        System.out.println("-----------");

        // stopwatch
        DigitalStopWatch s1 = new DigitalStopWatch("Casio");
        DigitalStopWatch s2 = new DigitalStopWatch("Titan");

        s1.start();
        s1.stop();
        s1.reset();
        s1.display();
        s1.lap();

        System.out.println("-----------");

        // jersey
        SportsJersey j1 = new SportsJersey();
        SportsJersey j2 = new SportsJersey();

        j1.wear();
        j1.wash();
        j1.dry();
        j1.fold();
        j1.store();

        j2.wear();
        j2.wash();
        j2.dry();
        j2.fold();
        j2.store();

        System.out.println("-----------");

        // mic
        WirelessMic m1 = new WirelessMic();
        WirelessMic m2 = new WirelessMic();

        m1.on();
        m1.off();
        m1.increaseVolume();
        m1.decreaseVolume();
        m1.mute();

        m2.on();
        m2.off();
        m2.increaseVolume();
        m2.decreaseVolume();
        m2.mute();

        System.out.println("-----------");

        // podium
        SmartPodium sp1 = new SmartPodium();
        SmartPodium sp2 = new SmartPodium();

        sp1.speak();
        sp1.adjustHeight();
        sp1.move();
        sp1.clean();
        sp1.setupMic();

        sp2.speak();
        sp2.adjustHeight();
        sp2.move();
        sp2.clean();
        sp2.setupMic();
    }
}
