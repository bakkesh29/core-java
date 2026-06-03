class Farm {

    String farmerName;
    String supervisorName;
    int noOfWorkers;
    SugarCane sugarCane;   // reference
    SoilType soilType;     // enum

    Farm(String farmerName, String supervisorName, int noOfWorkers, SugarCane sugarCane, SoilType soilType) {
        this.farmerName = farmerName;
        this.supervisorName = supervisorName;
        this.noOfWorkers = noOfWorkers;
        this.sugarCane = sugarCane;
        this.soilType = soilType;
    }

    void show() {
        System.out.println("Farmer Name: " + this.farmerName);
        System.out.println("Supervisor Name: " + this.supervisorName);
        System.out.println("No Of Workers: " + this.noOfWorkers);
        System.out.println("Soil Type: " + this.soilType);

        // Null check
        if (this.sugarCane != null) {
            this.sugarCane.display();
        } else {
            System.out.println("SugarCane is null");
        }
    }
}