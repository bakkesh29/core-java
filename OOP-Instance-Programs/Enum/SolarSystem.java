class SolarSystem {

    String ownerName;
    String location;
    int noOfPanels;
    SolarPanel solarPanel;   //reference
    PanelType panelType;     // enum

    SolarSystem(String ownerName, String location, int noOfPanels, SolarPanel solarPanel, PanelType panelType) {
        this.ownerName = ownerName;
        this.location = location;
        this.noOfPanels = noOfPanels;
        this.solarPanel = solarPanel;
        this.panelType = panelType;
    }

    void show() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Location: " + this.location);
        System.out.println("No Of Panels: " + this.noOfPanels);
        System.out.println("Panel Type: " + this.panelType);

        // Null check
        if (this.solarPanel != null) {
            this.solarPanel.display();
        } else {
            System.out.println("SolarPanel is null");
        }
    }
}