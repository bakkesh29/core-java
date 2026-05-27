public class Battery {

    private int batteryId;
    private String brand;
    private String type;
    private int capacity;
    private double voltage;

    public Battery() {

    }

    public Battery(int batteryId, String brand, String type,
                   int capacity, double voltage) {

        this.batteryId = batteryId;
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.voltage = voltage;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof Battery) {

            if (this.batteryId == ((Battery) ref).batteryId &&
                this.capacity == ((Battery) ref).capacity &&
                this.voltage == ((Battery) ref).voltage &&
                this.brand.equals(((Battery) ref).brand) &&
                this.type.equals(((Battery) ref).type)) {

                return true;
            }
        }

        return false;
    }
}