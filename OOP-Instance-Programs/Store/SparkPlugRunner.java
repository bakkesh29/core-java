class SparkPlugRunner {
    public static void main(String[] args) {

        SparkPlug sparkplug = new SparkPlug();

        sparkplug.saveSparkPlug("Bosch");
        sparkplug.saveSparkPlug("NGK");
        sparkplug.saveSparkPlug("Denso");
        sparkplug.saveSparkPlug("Champion");
        sparkplug.saveSparkPlug("Autolite");

        sparkplug.search("NGK");
        sparkplug.search("Sony");
    }
}