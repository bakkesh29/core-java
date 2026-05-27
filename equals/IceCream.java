public class IceCream {

    private int iceCreamId;
    private String flavor;
    private String brand;
    private int quantity;
    private double price;

    public IceCream() {

    }

    public IceCream(int iceCreamId, String flavor, String brand,
                    int quantity, double price) {

        this.iceCreamId = iceCreamId;
        this.flavor = flavor;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof IceCream) {

            if (this.iceCreamId == ((IceCream) ref).iceCreamId &&
                this.quantity == ((IceCream) ref).quantity &&
                this.price == ((IceCream) ref).price &&
                this.flavor.equals(((IceCream) ref).flavor) &&
                this.brand.equals(((IceCream) ref).brand)) {

                return true;
            }
        }

        return false;
    }
}