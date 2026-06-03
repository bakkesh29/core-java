class Zip {

    // 5 literals
    String type = "Compression";
    int size = 100;
    boolean isEncrypted = false;
    double ratio = 2.5;
    String format = ".zip";

    // 10 reference variables
    String fileName;
    int compressedSize;
    String method;
    int filesCount;
    String password;
    String platform;
    boolean isSplit;
    String creator;
    String version;
    String status;

    Zip() {
        System.out.println("Zip created");
    }
}