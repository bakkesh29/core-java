class GraphicCardRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        GraphicCard gamingCard = new GraphicCard();

        System.out.println("\n--- Before Reassigning ---\n");

        // Printing default (initialized) values
        System.out.println("Model     : " + gamingCard.model);
        System.out.println("Memory    : " + gamingCard.memory);
        System.out.println("Gaming    : " + gamingCard.isGaming);
        System.out.println("Price     : " + gamingCard.price);
        System.out.println("Brand     : " + gamingCard.brand);

        // Reassigning values
        gamingCard.model = "RTX 4070";
        gamingCard.memory = 16;
        gamingCard.isGaming = true;
        gamingCard.price = 80000;
        gamingCard.brand = "NVIDIA";

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Model     : " + gamingCard.model);
        System.out.println("Memory    : " + gamingCard.memory);
        System.out.println("Gaming    : " + gamingCard.isGaming);
        System.out.println("Price     : " + gamingCard.price);
        System.out.println("Brand     : " + gamingCard.brand);

        // Creating 10 instances
        GraphicCard officeCard = new GraphicCard();
        GraphicCard gamingCard2 = new GraphicCard();
        GraphicCard budgetCard = new GraphicCard();
        GraphicCard miningCard = new GraphicCard();
        GraphicCard editingCard = new GraphicCard();
        GraphicCard streamingCard = new GraphicCard();
        GraphicCard laptopCard = new GraphicCard();
        GraphicCard compactCard = new GraphicCard();
        GraphicCard workstationCard = new GraphicCard();
        GraphicCard oldCard = new GraphicCard();

        System.out.println("\n--- Default Values ---\n");

        // Default values (non-initialized variables)
        System.out.println("Office Card Cores: " + officeCard.cores);
        System.out.println("Gaming Card Cores: " + gamingCard2.cores);
        System.out.println("Budget Card Cores: " + budgetCard.cores);
        System.out.println("Mining Card Cores: " + miningCard.cores);
        System.out.println("Editing Card Cores: " + editingCard.cores);
        System.out.println("Streaming Card Cores: " + streamingCard.cores);
        System.out.println("Laptop Card Cores: " + laptopCard.cores);
        System.out.println("Compact Card Cores: " + compactCard.cores);
        System.out.println("Workstation Card Cores: " + workstationCard.cores);
        System.out.println("Old Card Cores: " + oldCard.cores);

        // Assigning values for ALL 10 objects

        // Office Card
        officeCard.cores = 256;
        officeCard.architecture = "Pascal";
        officeCard.clockSpeed = 1200;
        officeCard.rayTracing = false;
        officeCard.warranty = 2;
        officeCard.coolingType = "Single Fan";
        officeCard.compatibility = "Windows";
        officeCard.powerConsumption = 75;
        officeCard.portType = "HDMI";
        officeCard.size = "Small";

        // Gaming Card
        gamingCard2.cores = 5888;
        gamingCard2.architecture = "Ampere";
        gamingCard2.clockSpeed = 1800;
        gamingCard2.rayTracing = true;
        gamingCard2.warranty = 3;
        gamingCard2.coolingType = "Triple Fan";
        gamingCard2.compatibility = "Windows";
        gamingCard2.powerConsumption = 320;
        gamingCard2.portType = "DisplayPort";
        gamingCard2.size = "Large";

        // Budget Card
        budgetCard.cores = 384;
        budgetCard.architecture = "Polaris";
        budgetCard.clockSpeed = 1100;
        budgetCard.rayTracing = false;
        budgetCard.warranty = 1;
        budgetCard.coolingType = "Single Fan";
        budgetCard.compatibility = "All";
        budgetCard.powerConsumption = 50;
        budgetCard.portType = "HDMI";
        budgetCard.size = "Small";

        // Mining Card
        miningCard.cores = 3584;
        miningCard.architecture = "Ampere";
        miningCard.clockSpeed = 1700;
        miningCard.rayTracing = false;
        miningCard.warranty = 2;
        miningCard.coolingType = "Dual Fan";
        miningCard.compatibility = "Linux";
        miningCard.powerConsumption = 250;
        miningCard.portType = "HDMI";
        miningCard.size = "Medium";

        // Editing Card
        editingCard.cores = 7680;
        editingCard.architecture = "Ada";
        editingCard.clockSpeed = 2000;
        editingCard.rayTracing = true;
        editingCard.warranty = 3;
        editingCard.coolingType = "Triple Fan";
        editingCard.compatibility = "Windows";
        editingCard.powerConsumption = 350;
        editingCard.portType = "DisplayPort";
        editingCard.size = "Large";

        // Streaming Card
        streamingCard.cores = 1920;
        streamingCard.architecture = "Turing";
        streamingCard.clockSpeed = 1500;
        streamingCard.rayTracing = true;
        streamingCard.warranty = 2;
        streamingCard.coolingType = "Dual Fan";
        streamingCard.compatibility = "Windows";
        streamingCard.powerConsumption = 180;
        streamingCard.portType = "HDMI";
        streamingCard.size = "Medium";

        // Laptop Card
        laptopCard.cores = 640;
        laptopCard.architecture = "Mobile";
        laptopCard.clockSpeed = 1400;
        laptopCard.rayTracing = false;
        laptopCard.warranty = 1;
        laptopCard.coolingType = "Built-in";
        laptopCard.compatibility = "Laptop";
        laptopCard.powerConsumption = 50;
        laptopCard.portType = "Internal";
        laptopCard.size = "Compact";

        // Compact Card
        compactCard.cores = 1024;
        compactCard.architecture = "Turing";
        compactCard.clockSpeed = 1300;
        compactCard.rayTracing = false;
        compactCard.warranty = 2;
        compactCard.coolingType = "Single Fan";
        compactCard.compatibility = "Windows";
        compactCard.powerConsumption = 100;
        compactCard.portType = "HDMI";
        compactCard.size = "Small";

        // Workstation Card
        workstationCard.cores = 10752;
        workstationCard.architecture = "Ada";
        workstationCard.clockSpeed = 2200;
        workstationCard.rayTracing = true;
        workstationCard.warranty = 3;
        workstationCard.coolingType = "Dual Fan";
        workstationCard.compatibility = "Workstation";
        workstationCard.powerConsumption = 400;
        workstationCard.portType = "DisplayPort";
        workstationCard.size = "Large";

        // Old Card
        oldCard.cores = 512;
        oldCard.architecture = "Kepler";
        oldCard.clockSpeed = 900;
        oldCard.rayTracing = false;
        oldCard.warranty = 0;
        oldCard.coolingType = "Fan";
        oldCard.compatibility = "Windows";
        oldCard.powerConsumption = 60;
        oldCard.portType = "VGA";
        oldCard.size = "Small";

        System.out.println("\n--- After Assigning Values ---\n");

        // Example printing (Office Card)
        System.out.println("Office Card:");
        System.out.println("Cores            : " + officeCard.cores);
        System.out.println("Architecture     : " + officeCard.architecture);
        System.out.println("Clock Speed      : " + officeCard.clockSpeed);
        System.out.println("Ray Tracing      : " + officeCard.rayTracing);
        System.out.println("Warranty         : " + officeCard.warranty);
        System.out.println("Cooling Type     : " + officeCard.coolingType);
        System.out.println("Compatibility    : " + officeCard.compatibility);
        System.out.println("Power Consumption: " + officeCard.powerConsumption);
        System.out.println("Port Type        : " + officeCard.portType);
        System.out.println("Size             : " + officeCard.size);
        System.out.println("-----------------------------");

        // Gaming Card
System.out.println("Gaming Card:");
System.out.println("Cores            : " + gamingCard2.cores);
System.out.println("Architecture     : " + gamingCard2.architecture);
System.out.println("Clock Speed      : " + gamingCard2.clockSpeed);
System.out.println("Ray Tracing      : " + gamingCard2.rayTracing);
System.out.println("Warranty         : " + gamingCard2.warranty);
System.out.println("Cooling Type     : " + gamingCard2.coolingType);
System.out.println("Compatibility    : " + gamingCard2.compatibility);
System.out.println("Power Consumption: " + gamingCard2.powerConsumption);
System.out.println("Port Type        : " + gamingCard2.portType);
System.out.println("Size             : " + gamingCard2.size);
System.out.println("-----------------------------");

// Budget Card
System.out.println("Budget Card:");
System.out.println("Cores            : " + budgetCard.cores);
System.out.println("Architecture     : " + budgetCard.architecture);
System.out.println("Clock Speed      : " + budgetCard.clockSpeed);
System.out.println("Ray Tracing      : " + budgetCard.rayTracing);
System.out.println("Warranty         : " + budgetCard.warranty);
System.out.println("Cooling Type     : " + budgetCard.coolingType);
System.out.println("Compatibility    : " + budgetCard.compatibility);
System.out.println("Power Consumption: " + budgetCard.powerConsumption);
System.out.println("Port Type        : " + budgetCard.portType);
System.out.println("Size             : " + budgetCard.size);
System.out.println("-----------------------------");

// Mining Card
System.out.println("Mining Card:");
System.out.println("Cores            : " + miningCard.cores);
System.out.println("Architecture     : " + miningCard.architecture);
System.out.println("Clock Speed      : " + miningCard.clockSpeed);
System.out.println("Ray Tracing      : " + miningCard.rayTracing);
System.out.println("Warranty         : " + miningCard.warranty);
System.out.println("Cooling Type     : " + miningCard.coolingType);
System.out.println("Compatibility    : " + miningCard.compatibility);
System.out.println("Power Consumption: " + miningCard.powerConsumption);
System.out.println("Port Type        : " + miningCard.portType);
System.out.println("Size             : " + miningCard.size);
System.out.println("-----------------------------");

// Editing Card
System.out.println("Editing Card:");
System.out.println("Cores            : " + editingCard.cores);
System.out.println("Architecture     : " + editingCard.architecture);
System.out.println("Clock Speed      : " + editingCard.clockSpeed);
System.out.println("Ray Tracing      : " + editingCard.rayTracing);
System.out.println("Warranty         : " + editingCard.warranty);
System.out.println("Cooling Type     : " + editingCard.coolingType);
System.out.println("Compatibility    : " + editingCard.compatibility);
System.out.println("Power Consumption: " + editingCard.powerConsumption);
System.out.println("Port Type        : " + editingCard.portType);
System.out.println("Size             : " + editingCard.size);
System.out.println("-----------------------------");

// Streaming Card
System.out.println("Streaming Card:");
System.out.println("Cores            : " + streamingCard.cores);
System.out.println("Architecture     : " + streamingCard.architecture);
System.out.println("Clock Speed      : " + streamingCard.clockSpeed);
System.out.println("Ray Tracing      : " + streamingCard.rayTracing);
System.out.println("Warranty         : " + streamingCard.warranty);
System.out.println("Cooling Type     : " + streamingCard.coolingType);
System.out.println("Compatibility    : " + streamingCard.compatibility);
System.out.println("Power Consumption: " + streamingCard.powerConsumption);
System.out.println("Port Type        : " + streamingCard.portType);
System.out.println("Size             : " + streamingCard.size);
System.out.println("-----------------------------");

// Laptop Card
System.out.println("Laptop Card:");
System.out.println("Cores            : " + laptopCard.cores);
System.out.println("Architecture     : " + laptopCard.architecture);
System.out.println("Clock Speed      : " + laptopCard.clockSpeed);
System.out.println("Ray Tracing      : " + laptopCard.rayTracing);
System.out.println("Warranty         : " + laptopCard.warranty);
System.out.println("Cooling Type     : " + laptopCard.coolingType);
System.out.println("Compatibility    : " + laptopCard.compatibility);
System.out.println("Power Consumption: " + laptopCard.powerConsumption);
System.out.println("Port Type        : " + laptopCard.portType);
System.out.println("Size             : " + laptopCard.size);
System.out.println("-----------------------------");

// Compact Card
System.out.println("Compact Card:");
System.out.println("Cores            : " + compactCard.cores);
System.out.println("Architecture     : " + compactCard.architecture);
System.out.println("Clock Speed      : " + compactCard.clockSpeed);
System.out.println("Ray Tracing      : " + compactCard.rayTracing);
System.out.println("Warranty         : " + compactCard.warranty);
System.out.println("Cooling Type     : " + compactCard.coolingType);
System.out.println("Compatibility    : " + compactCard.compatibility);
System.out.println("Power Consumption: " + compactCard.powerConsumption);
System.out.println("Port Type        : " + compactCard.portType);
System.out.println("Size             : " + compactCard.size);
System.out.println("-----------------------------");

// Workstation Card
System.out.println("Workstation Card:");
System.out.println("Cores            : " + workstationCard.cores);
System.out.println("Architecture     : " + workstationCard.architecture);
System.out.println("Clock Speed      : " + workstationCard.clockSpeed);
System.out.println("Ray Tracing      : " + workstationCard.rayTracing);
System.out.println("Warranty         : " + workstationCard.warranty);
System.out.println("Cooling Type     : " + workstationCard.coolingType);
System.out.println("Compatibility    : " + workstationCard.compatibility);
System.out.println("Power Consumption: " + workstationCard.powerConsumption);
System.out.println("Port Type        : " + workstationCard.portType);
System.out.println("Size             : " + workstationCard.size);
System.out.println("-----------------------------");

// Old Card
System.out.println("Old Card:");
System.out.println("Cores            : " + oldCard.cores);
System.out.println("Architecture     : " + oldCard.architecture);
System.out.println("Clock Speed      : " + oldCard.clockSpeed);
System.out.println("Ray Tracing      : " + oldCard.rayTracing);
System.out.println("Warranty         : " + oldCard.warranty);
System.out.println("Cooling Type     : " + oldCard.coolingType);
System.out.println("Compatibility    : " + oldCard.compatibility);
System.out.println("Power Consumption: " + oldCard.powerConsumption);
System.out.println("Port Type        : " + oldCard.portType);
System.out.println("Size             : " + oldCard.size);
System.out.println("-----------------------------");
    }
}