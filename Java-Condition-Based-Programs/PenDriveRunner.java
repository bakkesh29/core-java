class PenDriveRunner {
    public static void main(String[] args) {

        int ref;

        String b1 = "SanDisk";
        ref = PenDrive.getSizeByBrand(b1);
        System.out.println("Size: " + ref + "GB");

        String b2 = "HP";
        ref = PenDrive.getSizeByBrand(b2);
        System.out.println("Size: " + ref + "GB");

        String b3 = "Sony";
        ref = PenDrive.getSizeByBrand(b3);
        System.out.println("Size: " + ref + "GB");

        String b4 = "Kingston";
        ref = PenDrive.getSizeByBrand(b4);
        System.out.println("Size: " + ref + "GB");

        String b5 = "Samsung";
        ref = PenDrive.getSizeByBrand(b5);
        System.out.println("Size: " + ref + "GB");
    }
}