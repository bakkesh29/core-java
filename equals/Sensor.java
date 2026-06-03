public class Sensor {

    private int sensorId;
    private String sensorType;
    private String company;
    private int range;
    private double price;

    public Sensor() {

    }

    public Sensor(int sensorId, String sensorType, String company,
                  int range, double price) {

        this.sensorId = sensorId;
        this.sensorType = sensorType;
        this.company = company;
        this.range = range;
        this.price = price;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof Sensor) {

            if (this.sensorId == ((Sensor) ref).sensorId &&
                this.range == ((Sensor) ref).range &&
                this.price == ((Sensor) ref).price &&
                this.sensorType.equals(((Sensor) ref).sensorType) &&
                this.company.equals(((Sensor) ref).company)) {

                return true;
            }
        }

        return false;
    }
}