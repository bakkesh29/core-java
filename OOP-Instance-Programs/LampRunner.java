class LampRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        Lamp studyTableLamp = new Lamp();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Type          : " + studyTableLamp.type);
        System.out.println("Color         : " + studyTableLamp.color);
        System.out.println("Brightness    : " + studyTableLamp.brightness);
        System.out.println("Rechargeable  : " + studyTableLamp.isRechargeable);
        System.out.println("Price         : " + studyTableLamp.price);

        // Reassigning values
        studyTableLamp.type = "Smart LED";
        studyTableLamp.color = "Warm Yellow";
        studyTableLamp.brightness = 1200;
        studyTableLamp.isRechargeable = false;
        studyTableLamp.price = 899.99;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Type          : " + studyTableLamp.type);
        System.out.println("Color         : " + studyTableLamp.color);
        System.out.println("Brightness    : " + studyTableLamp.brightness);
        System.out.println("Rechargeable  : " + studyTableLamp.isRechargeable);
        System.out.println("Price         : " + studyTableLamp.price);

        // Creating 10 instances
        Lamp bedroomLamp = new Lamp();
        Lamp deskLamp = new Lamp();
        Lamp nightLamp = new Lamp();
        Lamp floorLamp = new Lamp();
        Lamp wallLamp = new Lamp();
        Lamp studyLamp = new Lamp();
        Lamp readingLamp = new Lamp();
        Lamp officeLamp = new Lamp();
        Lamp decorativeLamp = new Lamp();
        Lamp outdoorLamp = new Lamp();

        System.out.println("\n--- Default Values ---\n");

        System.out.println("Bedroom Lamp Brand: " + bedroomLamp.brand);
        System.out.println("Desk Lamp Brand   : " + deskLamp.brand);
        System.out.println("Night Lamp Brand  : " + nightLamp.brand);
        System.out.println("Floor Lamp Brand  : " + floorLamp.brand);
        System.out.println("Wall Lamp Brand   : " + wallLamp.brand);
        System.out.println("Study Lamp Brand  : " + studyLamp.brand);
        System.out.println("Reading Lamp Brand: " + readingLamp.brand);
        System.out.println("Office Lamp Brand : " + officeLamp.brand);
        System.out.println("Decor Lamp Brand  : " + decorativeLamp.brand);
        System.out.println("Outdoor Lamp Brand: " + outdoorLamp.brand);

        // Assigning values

        bedroomLamp.brand = "Philips";
        bedroomLamp.shape = "Round";
        bedroomLamp.size = "Medium";
        bedroomLamp.location = "Bedroom";
        bedroomLamp.isPortable = true;
        bedroomLamp.warranty = 2;
        bedroomLamp.material = "Plastic";
        bedroomLamp.powerSource = "Battery";
        bedroomLamp.weight = 500;
        bedroomLamp.finish = "Matte";

        deskLamp.brand = "Wipro";
        deskLamp.shape = "Rectangle";
        deskLamp.size = "Small";
        deskLamp.location = "Desk";
        deskLamp.isPortable = true;
        deskLamp.warranty = 1;
        deskLamp.material = "Metal";
        deskLamp.powerSource = "Electric";
        deskLamp.weight = 700;
        deskLamp.finish = "Glossy";

        nightLamp.brand = "Syska";
        nightLamp.shape = "Oval";
        nightLamp.size = "Small";
        nightLamp.location = "Bedside";
        nightLamp.isPortable = true;
        nightLamp.warranty = 1;
        nightLamp.material = "Plastic";
        nightLamp.powerSource = "Battery";
        nightLamp.weight = 300;
        nightLamp.finish = "Matte";

        floorLamp.brand = "Ikea";
        floorLamp.shape = "Tall";
        floorLamp.size = "Large";
        floorLamp.location = "Living Room";
        floorLamp.isPortable = false;
        floorLamp.warranty = 3;
        floorLamp.material = "Steel";
        floorLamp.powerSource = "Electric";
        floorLamp.weight = 3000;
        floorLamp.finish = "Glossy";

        wallLamp.brand = "Havells";
        wallLamp.shape = "Square";
        wallLamp.size = "Medium";
        wallLamp.location = "Wall";
        wallLamp.isPortable = false;
        wallLamp.warranty = 2;
        wallLamp.material = "Glass";
        wallLamp.powerSource = "Electric";
        wallLamp.weight = 800;
        wallLamp.finish = "Glossy";

        studyLamp.brand = "Bajaj";
        studyLamp.shape = "Flexible";
        studyLamp.size = "Small";
        studyLamp.location = "Study Table";
        studyLamp.isPortable = true;
        studyLamp.warranty = 2;
        studyLamp.material = "Plastic";
        studyLamp.powerSource = "Electric";
        studyLamp.weight = 600;
        studyLamp.finish = "Matte";

        readingLamp.brand = "AmazonBasics";
        readingLamp.shape = "Clip";
        readingLamp.size = "Small";
        readingLamp.location = "Book";
        readingLamp.isPortable = true;
        readingLamp.warranty = 1;
        readingLamp.material = "Plastic";
        readingLamp.powerSource = "Battery";
        readingLamp.weight = 200;
        readingLamp.finish = "Matte";

        officeLamp.brand = "Mi";
        officeLamp.shape = "Modern";
        officeLamp.size = "Medium";
        officeLamp.location = "Office";
        officeLamp.isPortable = false;
        officeLamp.warranty = 2;
        officeLamp.material = "Metal";
        officeLamp.powerSource = "Electric";
        officeLamp.weight = 1000;
        officeLamp.finish = "Glossy";

        decorativeLamp.brand = "Pepperfry";
        decorativeLamp.shape = "Designer";
        decorativeLamp.size = "Medium";
        decorativeLamp.location = "Hall";
        decorativeLamp.isPortable = false;
        decorativeLamp.warranty = 3;
        decorativeLamp.material = "Glass";
        decorativeLamp.powerSource = "Electric";
        decorativeLamp.weight = 1200;
        decorativeLamp.finish = "Glossy";

        outdoorLamp.brand = "Local";
        outdoorLamp.shape = "Lantern";
        outdoorLamp.size = "Large";
        outdoorLamp.location = "Outdoor";
        outdoorLamp.isPortable = true;
        outdoorLamp.warranty = 1;
        outdoorLamp.material = "Metal";
        outdoorLamp.powerSource = "Battery";
        outdoorLamp.weight = 1500;
        outdoorLamp.finish = "Matte";

        System.out.println("\n--- After Assigning Values ---\n");

        // Bedroom Lamp
        System.out.println("Bedroom Lamp:");
        System.out.println("Brand        : " + bedroomLamp.brand);
        System.out.println("Shape        : " + bedroomLamp.shape);
        System.out.println("Size         : " + bedroomLamp.size);
        System.out.println("Location     : " + bedroomLamp.location);
        System.out.println("Portable     : " + bedroomLamp.isPortable);
        System.out.println("Warranty     : " + bedroomLamp.warranty);
        System.out.println("Material     : " + bedroomLamp.material);
        System.out.println("Power Source : " + bedroomLamp.powerSource);
        System.out.println("Weight       : " + bedroomLamp.weight);
        System.out.println("Finish       : " + bedroomLamp.finish);
        System.out.println("-------------------------------");

        // Desk Lamp
        System.out.println("Desk Lamp:");
        System.out.println("Brand        : " + deskLamp.brand);
        System.out.println("Shape        : " + deskLamp.shape);
        System.out.println("Size         : " + deskLamp.size);
        System.out.println("Location     : " + deskLamp.location);
        System.out.println("Portable     : " + deskLamp.isPortable);
        System.out.println("Warranty     : " + deskLamp.warranty);
        System.out.println("Material     : " + deskLamp.material);
        System.out.println("Power Source : " + deskLamp.powerSource);
        System.out.println("Weight       : " + deskLamp.weight);
        System.out.println("Finish       : " + deskLamp.finish);
        System.out.println("-------------------------------");

        // Night Lamp
        System.out.println("Night Lamp:");
        System.out.println("Brand        : " + nightLamp.brand);
        System.out.println("Shape        : " + nightLamp.shape);
        System.out.println("Size         : " + nightLamp.size);
        System.out.println("Location     : " + nightLamp.location);
        System.out.println("Portable     : " + nightLamp.isPortable);
        System.out.println("Warranty     : " + nightLamp.warranty);
        System.out.println("Material     : " + nightLamp.material);
        System.out.println("Power Source : " + nightLamp.powerSource);
        System.out.println("Weight       : " + nightLamp.weight);
        System.out.println("Finish       : " + nightLamp.finish);
        System.out.println("-------------------------------");

        // Floor Lamp
        System.out.println("Floor Lamp:");
        System.out.println("Brand        : " + floorLamp.brand);
        System.out.println("Shape        : " + floorLamp.shape);
        System.out.println("Size         : " + floorLamp.size);
        System.out.println("Location     : " + floorLamp.location);
        System.out.println("Portable     : " + floorLamp.isPortable);
        System.out.println("Warranty     : " + floorLamp.warranty);
        System.out.println("Material     : " + floorLamp.material);
        System.out.println("Power Source : " + floorLamp.powerSource);
        System.out.println("Weight       : " + floorLamp.weight);
        System.out.println("Finish       : " + floorLamp.finish);
        System.out.println("-------------------------------");

        // Wall Lamp
        System.out.println("Wall Lamp:");
        System.out.println("Brand        : " + wallLamp.brand);
        System.out.println("Shape        : " + wallLamp.shape);
        System.out.println("Size         : " + wallLamp.size);
        System.out.println("Location     : " + wallLamp.location);
        System.out.println("Portable     : " + wallLamp.isPortable);
        System.out.println("Warranty     : " + wallLamp.warranty);
        System.out.println("Material     : " + wallLamp.material);
        System.out.println("Power Source : " + wallLamp.powerSource);
        System.out.println("Weight       : " + wallLamp.weight);
        System.out.println("Finish       : " + wallLamp.finish);
        System.out.println("-------------------------------");
        // Study Lamp
        System.out.println("Study Lamp:");
        System.out.println("Brand        : " + studyLamp.brand);
        System.out.println("Shape        : " + studyLamp.shape);
        System.out.println("Size         : " + studyLamp.size);
        System.out.println("Location     : " + studyLamp.location);
        System.out.println("Portable     : " + studyLamp.isPortable);
        System.out.println("Warranty     : " + studyLamp.warranty);
        System.out.println("Material     : " + studyLamp.material);
        System.out.println("Power Source : " + studyLamp.powerSource);
        System.out.println("Weight       : " + studyLamp.weight);
        System.out.println("Finish       : " + studyLamp.finish);
        System.out.println("-------------------------------");

        // Reading Lamp
        System.out.println("Reading Lamp:");
        System.out.println("Brand        : " + readingLamp.brand);
        System.out.println("Shape        : " + readingLamp.shape);
        System.out.println("Size         : " + readingLamp.size);
        System.out.println("Location     : " + readingLamp.location);
        System.out.println("Portable     : " + readingLamp.isPortable);
        System.out.println("Warranty     : " + readingLamp.warranty);
        System.out.println("Material     : " + readingLamp.material);
        System.out.println("Power Source : " + readingLamp.powerSource);
        System.out.println("Weight       : " + readingLamp.weight);
        System.out.println("Finish       : " + readingLamp.finish);
        System.out.println("-------------------------------");

        // Office Lamp
        System.out.println("Office Lamp:");
        System.out.println("Brand        : " + officeLamp.brand);
        System.out.println("Shape        : " + officeLamp.shape);
        System.out.println("Size         : " + officeLamp.size);
        System.out.println("Location     : " + officeLamp.location);
        System.out.println("Portable     : " + officeLamp.isPortable);
        System.out.println("Warranty     : " + officeLamp.warranty);
        System.out.println("Material     : " + officeLamp.material);
        System.out.println("Power Source : " + officeLamp.powerSource);
        System.out.println("Weight       : " + officeLamp.weight);
        System.out.println("Finish       : " + officeLamp.finish);
        System.out.println("-------------------------------");

        // Decorative Lamp
        System.out.println("Decorative Lamp:");
        System.out.println("Brand        : " + decorativeLamp.brand);
        System.out.println("Shape        : " + decorativeLamp.shape);
        System.out.println("Size         : " + decorativeLamp.size);
        System.out.println("Location     : " + decorativeLamp.location);
        System.out.println("Portable     : " + decorativeLamp.isPortable);
        System.out.println("Warranty     : " + decorativeLamp.warranty);
        System.out.println("Material     : " + decorativeLamp.material);
        System.out.println("Power Source : " + decorativeLamp.powerSource);
        System.out.println("Weight       : " + decorativeLamp.weight);
        System.out.println("Finish       : " + decorativeLamp.finish);
        System.out.println("-------------------------------");

        // Outdoor Lamp
        System.out.println("Outdoor Lamp:");
        System.out.println("Brand        : " + outdoorLamp.brand);
        System.out.println("Shape        : " + outdoorLamp.shape);
        System.out.println("Size         : " + outdoorLamp.size);
        System.out.println("Location     : " + outdoorLamp.location);
        System.out.println("Portable     : " + outdoorLamp.isPortable);
        System.out.println("Warranty     : " + outdoorLamp.warranty);
        System.out.println("Material     : " + outdoorLamp.material);
        System.out.println("Power Source : " + outdoorLamp.powerSource);
        System.out.println("Weight       : " + outdoorLamp.weight);
        System.out.println("Finish       : " + outdoorLamp.finish);
        System.out.println("-------------------------------");
    }
}