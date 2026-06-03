class Application {

    
    void install() {
        System.out.println("Install is running in Application");
    }
    
    void runApp(Application app) {
        System.out.println("runApp() running in Application");
    }

    void install(String name) {
        System.out.println("Installing application: " + name);
    }
}