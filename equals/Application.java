public class Application {

    private int appId;
    private String appName;
    private String developer;
    private int downloads;
    private double rating;

    public Application() {

    }

    public Application(int appId, String appName, String developer,
                       int downloads, double rating) {

        this.appId = appId;
        this.appName = appName;
        this.developer = developer;
        this.downloads = downloads;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof Application) {

            if (this.appId == ((Application) ref).appId &&
                this.downloads == ((Application) ref).downloads &&
                this.rating == ((Application) ref).rating &&
                this.appName.equals(((Application) ref).appName) &&
                this.developer.equals(((Application) ref).developer)) {

                return true;
            }
        }

        return false;
    }
}