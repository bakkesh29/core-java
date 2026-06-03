public class Camera {

    private int cameraId;
    private String brand;
    private String model;
    private int megapixel;
    private double price;

    public Camera() {

    }

    public Camera(int cameraId, String brand, String model,
                  int megapixel, double price) {

        this.cameraId = cameraId;
        this.brand = brand;
        this.model = model;
        this.megapixel = megapixel;
        this.price = price;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof Camera) {

            if (this.cameraId == ((Camera) ref).cameraId &&
                this.megapixel == ((Camera) ref).megapixel &&
                this.price == ((Camera) ref).price &&
                this.brand.equals(((Camera) ref).brand) &&
                this.model.equals(((Camera) ref).model)) {

                return true;
            }
        }

        return false;
    }
}