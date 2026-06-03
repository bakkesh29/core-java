class WebApplication extends Application {

    @Override
    void install() {
        System.out.println("Install is running in WebApplication");
    }

    @Override
    void runApp(Application app) {
        System.out.println("runApp() running in WebApplication");
    }
}