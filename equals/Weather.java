public class Weather {

    private int temperature;
    private String climate;
    private String cityName;
    private int humidity;
    private double windSpeed;

    public Weather() {

    }

    public Weather(int temperature, String climate, String cityName,
                   int humidity, double windSpeed) {

        this.temperature = temperature;
        this.climate = climate;
        this.cityName = cityName;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof Weather) {

            if (this.temperature == ((Weather) ref).temperature &&
                this.humidity == ((Weather) ref).humidity &&
                this.windSpeed == ((Weather) ref).windSpeed &&
                this.climate.equals(((Weather) ref).climate) &&
                this.cityName.equals(((Weather) ref).cityName)) {

                return true;
            }
        }

        return false;
    }
}