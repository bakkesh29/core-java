class EnterpriseApplication extends WebApplication {

    @Override
    void install() {
        System.out.println("Install is running in EnterpriseApplication");
    }

    @Override
    void runApp(Application app) {
        System.out.println("runApp() running in EnterpriseApplication");
    }
}