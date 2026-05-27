public class TransportMode {

    private int modeId;
    private String vehicleName;
    private String fuelType;
    private int seatingCapacity;
    private double ticketPrice;

    public TransportMode() {

    }

    public TransportMode(int modeId, String vehicleName, String fuelType,
                         int seatingCapacity, double ticketPrice) {

        this.modeId = modeId;
        this.vehicleName = vehicleName;
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof TransportMode) {

            if (this.modeId == ((TransportMode) ref).modeId &&
                this.seatingCapacity == ((TransportMode) ref).seatingCapacity &&
                this.ticketPrice == ((TransportMode) ref).ticketPrice &&
                this.vehicleName.equals(((TransportMode) ref).vehicleName) &&
                this.fuelType.equals(((TransportMode) ref).fuelType)) {

                return true;
            }
        }

        return false;
    }
}