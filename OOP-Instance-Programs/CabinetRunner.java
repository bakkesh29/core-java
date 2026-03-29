class CabinetRunner {
    public static void main(String[] values) {

        // updating the literals
        // Meaningful reference variable name
        // Cabinet-datatype,
        // computerGamingCabinet=ref,
        // [= new Cabinet();]=COnstructor

        // for primitive reinit
        // for non primitive reinstantiating
        Cabinet computerGamingCabinet = new Cabinet();

        System.out.println("\n --- Before Reassigning --- \n");

        // Initial (literal) values
        System.out.println("Material : " + computerGamingCabinet.material);
        System.out.println("Color    : " + computerGamingCabinet.color);
        System.out.println("Shelves  : " + computerGamingCabinet.shelves);
        System.out.println("Has Lock : " + computerGamingCabinet.hasLock);
        System.out.println("Weight   : " + computerGamingCabinet.weight);

        // Reassigning values
        // Updating values
        // Invoke methods
        computerGamingCabinet.material = "Aluminum";
        computerGamingCabinet.color = "Black";
        computerGamingCabinet.shelves = 3;
        computerGamingCabinet.hasLock = false;
        computerGamingCabinet.weight = 15.0;

        System.out.println("\n--- After Reassigning ---\n");

        // Updated values
        System.out.println("Material : " + computerGamingCabinet.material);
        System.out.println("Color    : " + computerGamingCabinet.color);
        System.out.println("Shelves  : " + computerGamingCabinet.shelves);
        System.out.println("Has Lock : " + computerGamingCabinet.hasLock);
        System.out.println("Weight   : " + computerGamingCabinet.weight);

        // cabinet=class (data type)
        // c1 =reference variable
        // new Cabinet() (constructor)
        // Declaration and initialization of instance
        // Creating 10 instances
        Cabinet bedroomCabinet = new Cabinet();
        Cabinet kitchenCabinet = new Cabinet();
        Cabinet officeCabinet = new Cabinet();
        Cabinet hallCabinet = new Cabinet();
        Cabinet studyCabinet = new Cabinet();
        Cabinet storageCabinet = new Cabinet();
        Cabinet garageCabinet = new Cabinet();
        Cabinet wardrobeCabinet = new Cabinet();
        Cabinet displayCabinet = new Cabinet();
        Cabinet gamingCabinet = new Cabinet();


        System.out.println("\n--- Default Values (Before Assigning) ---\n");

        // bedroomCabinet
        System.out.println("Bedroom Cabinet:");
        System.out.println("Brand      : " + bedroomCabinet.brand);
        System.out.println("Price      : " + bedroomCabinet.price);
        System.out.println("Type       : " + bedroomCabinet.type);
        System.out.println("Size       : " + bedroomCabinet.size);
        System.out.println("Location   : " + bedroomCabinet.location);
        System.out.println("Portable   : " + bedroomCabinet.isPortable);
        System.out.println("Doors      : " + bedroomCabinet.doors);
        System.out.println("Shape      : " + bedroomCabinet.shape);
        System.out.println("Finish     : " + bedroomCabinet.finish);
        System.out.println("Warranty   : " + bedroomCabinet.warranty);
       System.out.println("-------------------------------");

        // kitchenCabinet
        System.out.println("Kitchen Cabinet:");
        System.out.println("Brand      : " + kitchenCabinet.brand);
        System.out.println("Price      : " + kitchenCabinet.price);
        System.out.println("Type       : " + kitchenCabinet.type);
        System.out.println("Size       : " + kitchenCabinet.size);
        System.out.println("Location   : " + kitchenCabinet.location);
        System.out.println("Portable   : " + kitchenCabinet.isPortable);
        System.out.println("Doors      : " + kitchenCabinet.doors);
        System.out.println("Shape      : " + kitchenCabinet.shape);
        System.out.println("Finish     : " + kitchenCabinet.finish);
        System.out.println("Warranty   : " + kitchenCabinet.warranty);
        System.out.println("-------------------------------");

        // officeCabinet
        System.out.println("Office Cabinet:");
        System.out.println("Brand      : " + officeCabinet.brand);
        System.out.println("Price      : " + officeCabinet.price);
        System.out.println("Type       : " + officeCabinet.type);
        System.out.println("Size       : " + officeCabinet.size);
        System.out.println("Location   : " + officeCabinet.location);
        System.out.println("Portable   : " + officeCabinet.isPortable);
        System.out.println("Doors      : " + officeCabinet.doors);
        System.out.println("Shape      : " + officeCabinet.shape);
        System.out.println("Finish     : " + officeCabinet.finish);
        System.out.println("Warranty   : " + officeCabinet.warranty);
        System.out.println("-------------------------------");

        // hallCabinet
        System.out.println("Hall Cabinet:");
        System.out.println("Brand      : " + hallCabinet.brand);
        System.out.println("Price      : " + hallCabinet.price);
        System.out.println("Type       : " + hallCabinet.type);
        System.out.println("Size       : " + hallCabinet.size);
        System.out.println("Location   : " + hallCabinet.location);
        System.out.println("Portable   : " + hallCabinet.isPortable);
        System.out.println("Doors      : " + hallCabinet.doors);
        System.out.println("Shape      : " + hallCabinet.shape);
        System.out.println("Finish     : " + hallCabinet.finish);
        System.out.println("Warranty   : " + hallCabinet.warranty);
        System.out.println("-------------------------------");

        // studyCabinet
        System.out.println("Study Cabinet:");
        System.out.println("Brand      : " + studyCabinet.brand);
        System.out.println("Price      : " + studyCabinet.price);
        System.out.println("Type       : " + studyCabinet.type);
        System.out.println("Size       : " + studyCabinet.size);
        System.out.println("Location   : " + studyCabinet.location);
        System.out.println("Portable   : " + studyCabinet.isPortable);
        System.out.println("Doors      : " + studyCabinet.doors);
        System.out.println("Shape      : " + studyCabinet.shape);
        System.out.println("Finish     : " + studyCabinet.finish);
        System.out.println("Warranty   : " + studyCabinet.warranty);
        System.out.println("-------------------------------");

        // storageCabinet
        System.out.println("Storage Cabinet:");
        System.out.println("Brand      : " + storageCabinet.brand);
        System.out.println("Price      : " + storageCabinet.price);
        System.out.println("Type       : " + storageCabinet.type);
        System.out.println("Size       : " + storageCabinet.size);
        System.out.println("Location   : " + storageCabinet.location);
        System.out.println("Portable   : " + storageCabinet.isPortable);
        System.out.println("Doors      : " + storageCabinet.doors);
        System.out.println("Shape      : " + storageCabinet.shape);
        System.out.println("Finish     : " + storageCabinet.finish);
        System.out.println("Warranty   : " + storageCabinet.warranty);
        System.out.println("-------------------------------");

        // garageCabinet
        System.out.println("Garage Cabinet:");
        System.out.println("Brand      : " + garageCabinet.brand);
        System.out.println("Price      : " + garageCabinet.price);
        System.out.println("Type       : " + garageCabinet.type);
        System.out.println("Size       : " + garageCabinet.size);
        System.out.println("Location   : " + garageCabinet.location);
        System.out.println("Portable   : " + garageCabinet.isPortable);
        System.out.println("Doors      : " + garageCabinet.doors);
        System.out.println("Shape      : " + garageCabinet.shape);
        System.out.println("Finish     : " + garageCabinet.finish);
        System.out.println("Warranty   : " + garageCabinet.warranty);
        System.out.println("-------------------------------");

        // wardrobeCabinet
        System.out.println("Wardrobe Cabinet:");
        System.out.println("Brand      : " + wardrobeCabinet.brand);
        System.out.println("Price      : " + wardrobeCabinet.price);
        System.out.println("Type       : " + wardrobeCabinet.type);
        System.out.println("Size       : " + wardrobeCabinet.size);
        System.out.println("Location   : " + wardrobeCabinet.location);
        System.out.println("Portable   : " + wardrobeCabinet.isPortable);
        System.out.println("Doors      : " + wardrobeCabinet.doors);
        System.out.println("Shape      : " + wardrobeCabinet.shape);
        System.out.println("Finish     : " + wardrobeCabinet.finish);
        System.out.println("Warranty   : " + wardrobeCabinet.warranty);
      System.out.println("-------------------------------");

        // displayCabinet
        System.out.println("Display Cabinet:");
        System.out.println("Brand      : " + displayCabinet.brand);
        System.out.println("Price      : " + displayCabinet.price);
        System.out.println("Type       : " + displayCabinet.type);
        System.out.println("Size       : " + displayCabinet.size);
        System.out.println("Location   : " + displayCabinet.location);
        System.out.println("Portable   : " + displayCabinet.isPortable);
        System.out.println("Doors      : " + displayCabinet.doors);
        System.out.println("Shape      : " + displayCabinet.shape);
        System.out.println("Finish     : " + displayCabinet.finish);
        System.out.println("Warranty   : " + displayCabinet.warranty);
    System.out.println("-------------------------------");

        // gamingCabinet
        System.out.println("Gaming Cabinet:");
        System.out.println("Brand      : " + gamingCabinet.brand);
        System.out.println("Price      : " + gamingCabinet.price);
        System.out.println("Type       : " + gamingCabinet.type);
        System.out.println("Size       : " + gamingCabinet.size);
        System.out.println("Location   : " + gamingCabinet.location);
        System.out.println("Portable   : " + gamingCabinet.isPortable);
        System.out.println("Doors      : " + gamingCabinet.doors);
        System.out.println("Shape      : " + gamingCabinet.shape);
        System.out.println("Finish     : " + gamingCabinet.finish);
        System.out.println("Warranty   : " + gamingCabinet.warranty);
     System.out.println("-------------------------------");

        // Initialize remaining 10 variables using reference
        // Updating values
        // Invoke methods
        // bedroomCabinet
        bedroomCabinet.brand = "Godrej";
        bedroomCabinet.price = 10000;
        bedroomCabinet.type = "Storage";
        bedroomCabinet.size = "Large";
        bedroomCabinet.location = "Bedroom";
        bedroomCabinet.isPortable = false;
        bedroomCabinet.doors = 2;
        bedroomCabinet.shape = "Rectangle";
        bedroomCabinet.finish = "Matte";
        bedroomCabinet.warranty = 5;

        // kitchenCabinet
        kitchenCabinet.brand = "Ikea";
        kitchenCabinet.price = 8000;
        kitchenCabinet.type = "Kitchen";
        kitchenCabinet.size = "Medium";
        kitchenCabinet.location = "Kitchen";
        kitchenCabinet.isPortable = true;
        kitchenCabinet.doors = 3;
        kitchenCabinet.shape = "Square";
        kitchenCabinet.finish = "Glossy";
        kitchenCabinet.warranty = 3;

        // officeCabinet
        officeCabinet.brand = "Nilkamal";
        officeCabinet.price = 6000;
        officeCabinet.type = "Office";
        officeCabinet.size = "Small";
        officeCabinet.location = "Office";
        officeCabinet.isPortable = true;
        officeCabinet.doors = 2;
        officeCabinet.shape = "Rectangle";
        officeCabinet.finish = "Matte";
        officeCabinet.warranty = 2;

        // hallCabinet
        hallCabinet.brand = "Urban";
        hallCabinet.price = 7000;
        hallCabinet.type = "Living";
        hallCabinet.size = "Medium";
        hallCabinet.location = "Hall";
        hallCabinet.isPortable = true;
        hallCabinet.doors = 2;
        hallCabinet.shape = "Square";
        hallCabinet.finish = "Matte";
        hallCabinet.warranty = 3;

        // studyCabinet
        studyCabinet.brand = "Amazon";
        studyCabinet.price = 5000;
        studyCabinet.type = "Storage";
        studyCabinet.size = "Small";
        studyCabinet.location = "Study";
        studyCabinet.isPortable = true;
        studyCabinet.doors = 1;
        studyCabinet.shape = "Square";
        studyCabinet.finish = "Glossy";
        studyCabinet.warranty = 2;

        // storageCabinet
        storageCabinet.brand = "Local";
        storageCabinet.price = 4000;
        storageCabinet.type = "Storage";
        storageCabinet.size = "Small";
        storageCabinet.location = "Store";
        storageCabinet.isPortable = true;
        storageCabinet.doors = 1;
        storageCabinet.shape = "Square";
        storageCabinet.finish = "Matte";
        storageCabinet.warranty = 1;

        // garageCabinet
        garageCabinet.brand = "HomeTown";
        garageCabinet.price = 9000;
        garageCabinet.type = "Storage";
        garageCabinet.size = "Large";
        garageCabinet.location = "Garage";
        garageCabinet.isPortable = false;
        garageCabinet.doors = 3;
        garageCabinet.shape = "Rectangle";
        garageCabinet.finish = "Glossy";
        garageCabinet.warranty = 4;

        // wardrobeCabinet
        wardrobeCabinet.brand = "Durian";
        wardrobeCabinet.price = 12000;
        wardrobeCabinet.type = "Wardrobe";
        wardrobeCabinet.size = "Large";
        wardrobeCabinet.location = "Bedroom";
        wardrobeCabinet.isPortable = false;
        wardrobeCabinet.doors = 4;
        wardrobeCabinet.shape = "Rectangle";
        wardrobeCabinet.finish = "Glossy";
        wardrobeCabinet.warranty = 6;

        // displayCabinet
        displayCabinet.brand = "Pepperfry";
        displayCabinet.price = 11000;
        displayCabinet.type = "Wardrobe";
        displayCabinet.size = "Large";
        displayCabinet.location = "Bedroom";
        displayCabinet.isPortable = false;
        displayCabinet.doors = 4;
        displayCabinet.shape = "Rectangle";
        displayCabinet.finish = "Matte";
        displayCabinet.warranty = 5;

        // gamingCabinet
        gamingCabinet.brand = "Flipkart";
        gamingCabinet.price = 6500;
        gamingCabinet.type = "Kitchen";
        gamingCabinet.size = "Medium";
        gamingCabinet.location = "Kitchen";
        gamingCabinet.isPortable = true;
        gamingCabinet.doors = 2;
        gamingCabinet.shape = "Rectangle";
        gamingCabinet.finish = "Matte";
        gamingCabinet.warranty = 3;

        System.out.println("\n--- After Assigning Values ---\n");

        // Printing all values
        // bedroomCabinet
        System.out.println("Bedroom Cabinet:");
        System.out.println("Brand      : " + bedroomCabinet.brand);
        System.out.println("Price      : " + bedroomCabinet.price);
        System.out.println("Type       : " + bedroomCabinet.type);
        System.out.println("Size       : " + bedroomCabinet.size);
        System.out.println("Location   : " + bedroomCabinet.location);
        System.out.println("Portable   : " + bedroomCabinet.isPortable);
        System.out.println("Doors      : " + bedroomCabinet.doors);
        System.out.println("Shape      : " + bedroomCabinet.shape);
        System.out.println("Finish     : " + bedroomCabinet.finish);
        System.out.println("Warranty   : " + bedroomCabinet.warranty);
       System.out.println("-------------------------------");

        // kitchenCabinet
        System.out.println("Kitchen Cabinet:");
        System.out.println("Brand      : " + kitchenCabinet.brand);
        System.out.println("Price      : " + kitchenCabinet.price);
        System.out.println("Type       : " + kitchenCabinet.type);
        System.out.println("Size       : " + kitchenCabinet.size);
        System.out.println("Location   : " + kitchenCabinet.location);
        System.out.println("Portable   : " + kitchenCabinet.isPortable);
        System.out.println("Doors      : " + kitchenCabinet.doors);
        System.out.println("Shape      : " + kitchenCabinet.shape);
        System.out.println("Finish     : " + kitchenCabinet.finish);
        System.out.println("Warranty   : " + kitchenCabinet.warranty);
        System.out.println("-------------------------------");

        // officeCabinet
        System.out.println("Office Cabinet:");
        System.out.println("Brand      : " + officeCabinet.brand);
        System.out.println("Price      : " + officeCabinet.price);
        System.out.println("Type       : " + officeCabinet.type);
        System.out.println("Size       : " + officeCabinet.size);
        System.out.println("Location   : " + officeCabinet.location);
        System.out.println("Portable   : " + officeCabinet.isPortable);
        System.out.println("Doors      : " + officeCabinet.doors);
        System.out.println("Shape      : " + officeCabinet.shape);
        System.out.println("Finish     : " + officeCabinet.finish);
        System.out.println("Warranty   : " + officeCabinet.warranty);
        System.out.println("-------------------------------");

        // hallCabinet
        System.out.println("Hall Cabinet:");
        System.out.println("Brand      : " + hallCabinet.brand);
        System.out.println("Price      : " + hallCabinet.price);
        System.out.println("Type       : " + hallCabinet.type);
        System.out.println("Size       : " + hallCabinet.size);
        System.out.println("Location   : " + hallCabinet.location);
        System.out.println("Portable   : " + hallCabinet.isPortable);
        System.out.println("Doors      : " + hallCabinet.doors);
        System.out.println("Shape      : " + hallCabinet.shape);
        System.out.println("Finish     : " + hallCabinet.finish);
        System.out.println("Warranty   : " + hallCabinet.warranty);
        System.out.println("-------------------------------");

        // studyCabinet
        System.out.println("Study Cabinet:");
        System.out.println("Brand      : " + studyCabinet.brand);
        System.out.println("Price      : " + studyCabinet.price);
        System.out.println("Type       : " + studyCabinet.type);
        System.out.println("Size       : " + studyCabinet.size);
        System.out.println("Location   : " + studyCabinet.location);
        System.out.println("Portable   : " + studyCabinet.isPortable);
        System.out.println("Doors      : " + studyCabinet.doors);
        System.out.println("Shape      : " + studyCabinet.shape);
        System.out.println("Finish     : " + studyCabinet.finish);
        System.out.println("Warranty   : " + studyCabinet.warranty);
        System.out.println("-------------------------------");

        // storageCabinet
        System.out.println("Storage Cabinet:");
        System.out.println("Brand      : " + storageCabinet.brand);
        System.out.println("Price      : " + storageCabinet.price);
        System.out.println("Type       : " + storageCabinet.type);
        System.out.println("Size       : " + storageCabinet.size);
        System.out.println("Location   : " + storageCabinet.location);
        System.out.println("Portable   : " + storageCabinet.isPortable);
        System.out.println("Doors      : " + storageCabinet.doors);
        System.out.println("Shape      : " + storageCabinet.shape);
        System.out.println("Finish     : " + storageCabinet.finish);
        System.out.println("Warranty   : " + storageCabinet.warranty);
       System.out.println("-------------------------------");

        // garageCabinet
        System.out.println("Garage Cabinet:");
        System.out.println("Brand      : " + garageCabinet.brand);
        System.out.println("Price      : " + garageCabinet.price);
        System.out.println("Type       : " + garageCabinet.type);
        System.out.println("Size       : " + garageCabinet.size);
        System.out.println("Location   : " + garageCabinet.location);
        System.out.println("Portable   : " + garageCabinet.isPortable);
        System.out.println("Doors      : " + garageCabinet.doors);
        System.out.println("Shape      : " + garageCabinet.shape);
        System.out.println("Finish     : " + garageCabinet.finish);
        System.out.println("Warranty   : " + garageCabinet.warranty);
 System.out.println("-------------------------------");

        // wardrobeCabinet
        System.out.println("Wardrobe Cabinet:");
        System.out.println("Brand      : " + wardrobeCabinet.brand);
        System.out.println("Price      : " + wardrobeCabinet.price);
        System.out.println("Type       : " + wardrobeCabinet.type);
        System.out.println("Size       : " + wardrobeCabinet.size);
        System.out.println("Location   : " + wardrobeCabinet.location);
        System.out.println("Portable   : " + wardrobeCabinet.isPortable);
        System.out.println("Doors      : " + wardrobeCabinet.doors);
        System.out.println("Shape      : " + wardrobeCabinet.shape);
        System.out.println("Finish     : " + wardrobeCabinet.finish);
        System.out.println("Warranty   : " + wardrobeCabinet.warranty);
       System.out.println("-------------------------------");

        // displayCabinet
        System.out.println("Display Cabinet:");
        System.out.println("Brand      : " + displayCabinet.brand);
        System.out.println("Price      : " + displayCabinet.price);
        System.out.println("Type       : " + displayCabinet.type);
        System.out.println("Size       : " + displayCabinet.size);
        System.out.println("Location   : " + displayCabinet.location);
        System.out.println("Portable   : " + displayCabinet.isPortable);
        System.out.println("Doors      : " + displayCabinet.doors);
        System.out.println("Shape      : " + displayCabinet.shape);
        System.out.println("Finish     : " + displayCabinet.finish);
        System.out.println("Warranty   : " + displayCabinet.warranty);
       System.out.println("-------------------------------");

        // gamingCabinet
        System.out.println("Gaming Cabinet:");
        System.out.println("Brand      : " + gamingCabinet.brand);
        System.out.println("Price      : " + gamingCabinet.price);
        System.out.println("Type       : " + gamingCabinet.type);
        System.out.println("Size       : " + gamingCabinet.size);
        System.out.println("Location   : " + gamingCabinet.location);
        System.out.println("Portable   : " + gamingCabinet.isPortable);
        System.out.println("Doors      : " + gamingCabinet.doors);
        System.out.println("Shape      : " + gamingCabinet.shape);
        System.out.println("Finish     : " + gamingCabinet.finish);
        System.out.println("Warranty   : " + gamingCabinet.warranty);
        System.out.println("-------------------------------");

    }
}