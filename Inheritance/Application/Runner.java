class Runner {

    public static void main(String... bakkesh) {

        System.out.println("---- Runtime Polymorphism ----");

        Application app1 = new WebApplication();
        app1.install();  

        Application app2 = new EnterpriseApplication();
        app2.install();   


        System.out.println("\n---- Method with Application Parameter ----");

        app1.runApp(app2);   
        app2.runApp(app1);   


        System.out.println("\n---- Compile-Time Polymorphism ----");

        Application app3 = new Application();
        //Compile-Time Polymorphism
        app3.install();              
        app3.install("Instagram");   
    }
}