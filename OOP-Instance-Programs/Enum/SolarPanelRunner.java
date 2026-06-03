class SolarPanelRunner {

    public static void main(String[] args) {

        SolarPanel sp = new SolarPanel("Tata Power", 450);

        SolarSystem system = new SolarSystem(
                "Ramesh",
                "Bangalore",
                20,
                sp,
                PanelType.MONOCRYSTALLINE
        );

        system.show();
    }
}