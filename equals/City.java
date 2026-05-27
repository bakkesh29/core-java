public class City {

    private int cityId;
    private String cityName;
    private String state;
    private int population;
    private double area;

    public City() {

    }

    public City(int cityId, String cityName, String state,
                int population, double area) {

        this.cityId = cityId;
        this.cityName = cityName;
        this.state = state;
        this.population = population;
        this.area = area;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof City) {

            if (this.cityId == ((City) ref).cityId &&
                this.population == ((City) ref).population &&
                this.area == ((City) ref).area &&
                this.cityName.equals(((City) ref).cityName) &&
                this.state.equals(((City) ref).state)) {

                return true;
            }
        }

        return false;
    }
}