public class LedData {
    public static void main(String[] args) {
        byte pins = 2;
        short brightnessLumens = 800;
        int lifespanHours = 50000;
        long partNumber = 998877665544L;
        float operatingVoltage = 3.2f;
        double manufacturingCost = 0.45;
        boolean isDimmable = true;
        char energyClass = 'A';

        System.out.println(pins);
        System.out.println(brightnessLumens);
        System.out.println(lifespanHours);
        System.out.println(partNumber);
        System.out.println(operatingVoltage);
        System.out.println(manufacturingCost);
        System.out.println(isDimmable);
        System.out.println(energyClass);
    }
}
