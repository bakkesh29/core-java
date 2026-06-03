class FireRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        Fire campFire = new Fire();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Color       : " + campFire.color);
        System.out.println("Temperature : " + campFire.temperature);
        System.out.println("Dangerous   : " + campFire.isDangerous);
        System.out.println("Type        : " + campFire.type);
        System.out.println("Intensity   : " + campFire.intensity);

        // Reassigning values
        campFire.color = "Blue";
        campFire.temperature = 700;
        campFire.isDangerous = false;
        campFire.type = "Controlled";
        campFire.intensity = 5.5;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Color       : " + campFire.color);
        System.out.println("Temperature : " + campFire.temperature);
        System.out.println("Dangerous   : " + campFire.isDangerous);
        System.out.println("Type        : " + campFire.type);
        System.out.println("Intensity   : " + campFire.intensity);

        // Creating 10 instances
        Fire forestFire = new Fire();
        Fire kitchenFire = new Fire();
        Fire industrialFire = new Fire();
        Fire electricalFire = new Fire();
        Fire gasFire = new Fire();
        Fire chemicalFire = new Fire();
        Fire wildfire = new Fire();
        Fire campfire2 = new Fire();
        Fire stoveFire = new Fire();
        Fire accidentFire = new Fire();

        System.out.println("\n--- Default Values ---\n");

        // Printing default values
        System.out.println("Forest Fire Fuel: " + forestFire.fuel);
        System.out.println("Kitchen Fire Fuel: " + kitchenFire.fuel);
        System.out.println("Industrial Fire Fuel: " + industrialFire.fuel);
        System.out.println("Electrical Fire Fuel: " + electricalFire.fuel);
        System.out.println("Gas Fire Fuel: " + gasFire.fuel);
        System.out.println("Chemical Fire Fuel: " + chemicalFire.fuel);
        System.out.println("Wild Fire Fuel: " + wildfire.fuel);
        System.out.println("Campfire Fuel: " + campfire2.fuel);
        System.out.println("Stove Fire Fuel: " + stoveFire.fuel);
        System.out.println("Accident Fire Fuel: " + accidentFire.fuel);

        // Assigning values to ALL objects

        // Forest Fire
        forestFire.fuel = "Wood";
        forestFire.location = "Forest";
        forestFire.cause = "Lightning";
        forestFire.isControlled = false;
        forestFire.duration = 10;
        forestFire.smokeLevel = "High";
        forestFire.heatLevel = "Extreme";
        forestFire.spreadSpeed = "Fast";
        forestFire.extinguisherType = "Water";
        forestFire.effect = "Destruction";

        // Kitchen Fire
        kitchenFire.fuel = "Oil";
        kitchenFire.location = "Kitchen";
        kitchenFire.cause = "Overheating";
        kitchenFire.isControlled = true;
        kitchenFire.duration = 2;
        kitchenFire.smokeLevel = "Medium";
        kitchenFire.heatLevel = "High";
        kitchenFire.spreadSpeed = "Slow";
        kitchenFire.extinguisherType = "Foam";
        kitchenFire.effect = "Damage";

        // Industrial Fire
        industrialFire.fuel = "Chemicals";
        industrialFire.location = "Factory";
        industrialFire.cause = "Explosion";
        industrialFire.isControlled = false;
        industrialFire.duration = 15;
        industrialFire.smokeLevel = "Very High";
        industrialFire.heatLevel = "Extreme";
        industrialFire.spreadSpeed = "Very Fast";
        industrialFire.extinguisherType = "CO2";
        industrialFire.effect = "Severe Damage";

        // Electrical Fire
        electricalFire.fuel = "Wires";
        electricalFire.location = "Office";
        electricalFire.cause = "Short Circuit";
        electricalFire.isControlled = true;
        electricalFire.duration = 3;
        electricalFire.smokeLevel = "Low";
        electricalFire.heatLevel = "Medium";
        electricalFire.spreadSpeed = "Slow";
        electricalFire.extinguisherType = "CO2";
        electricalFire.effect = "Minor Damage";

        // Gas Fire
        gasFire.fuel = "Gas";
        gasFire.location = "Kitchen";
        gasFire.cause = "Leakage";
        gasFire.isControlled = false;
        gasFire.duration = 5;
        gasFire.smokeLevel = "Low";
        gasFire.heatLevel = "High";
        gasFire.spreadSpeed = "Fast";
        gasFire.extinguisherType = "Dry Powder";
        gasFire.effect = "Explosion Risk";

        // Chemical Fire
        chemicalFire.fuel = "Acid";
        chemicalFire.location = "Lab";
        chemicalFire.cause = "Reaction";
        chemicalFire.isControlled = false;
        chemicalFire.duration = 7;
        chemicalFire.smokeLevel = "High";
        chemicalFire.heatLevel = "Extreme";
        chemicalFire.spreadSpeed = "Fast";
        chemicalFire.extinguisherType = "Foam";
        chemicalFire.effect = "Hazard";

        // Wildfire
        wildfire.fuel = "Dry Leaves";
        wildfire.location = "Forest";
        wildfire.cause = "Heat";
        wildfire.isControlled = false;
        wildfire.duration = 20;
        wildfire.smokeLevel = "Very High";
        wildfire.heatLevel = "Extreme";
        wildfire.spreadSpeed = "Very Fast";
        wildfire.extinguisherType = "Water";
        wildfire.effect = "Massive Damage";

        // Campfire
        campfire2.fuel = "Wood";
        campfire2.location = "Camping Area";
        campfire2.cause = "Human";
        campfire2.isControlled = true;
        campfire2.duration = 4;
        campfire2.smokeLevel = "Low";
        campfire2.heatLevel = "Medium";
        campfire2.spreadSpeed = "None";
        campfire2.extinguisherType = "Water";
        campfire2.effect = "Safe";

        // Stove Fire
        stoveFire.fuel = "Gas";
        stoveFire.location = "Kitchen";
        stoveFire.cause = "Leak";
        stoveFire.isControlled = true;
        stoveFire.duration = 2;
        stoveFire.smokeLevel = "Low";
        stoveFire.heatLevel = "High";
        stoveFire.spreadSpeed = "Slow";
        stoveFire.extinguisherType = "Foam";
        stoveFire.effect = "Damage";

        // Accident Fire
        accidentFire.fuel = "Petrol";
        accidentFire.location = "Road";
        accidentFire.cause = "Accident";
        accidentFire.isControlled = false;
        accidentFire.duration = 6;
        accidentFire.smokeLevel = "High";
        accidentFire.heatLevel = "Extreme";
        accidentFire.spreadSpeed = "Fast";
        accidentFire.extinguisherType = "Dry Powder";
        accidentFire.effect = "Severe Damage";

        System.out.println("\n--- After Assigning Values ---\n");

        // Example (Forest Fire)
        System.out.println("Forest Fire:");
        System.out.println("Fuel         : " + forestFire.fuel);
        System.out.println("Location     : " + forestFire.location);
        System.out.println("Cause        : " + forestFire.cause);
        System.out.println("Controlled   : " + forestFire.isControlled);
        System.out.println("Duration     : " + forestFire.duration);
        System.out.println("Smoke Level  : " + forestFire.smokeLevel);
        System.out.println("Heat Level   : " + forestFire.heatLevel);
        System.out.println("Spread Speed : " + forestFire.spreadSpeed);
        System.out.println("Extinguisher : " + forestFire.extinguisherType);
        System.out.println("Effect       : " + forestFire.effect);
        System.out.println("-----------------------------");

        /// Kitchen Fire
        System.out.println("Kitchen Fire:");
        System.out.println("Fuel         : " + kitchenFire.fuel);
        System.out.println("Location     : " + kitchenFire.location);
        System.out.println("Cause        : " + kitchenFire.cause);
        System.out.println("Controlled   : " + kitchenFire.isControlled);
        System.out.println("Duration     : " + kitchenFire.duration);
        System.out.println("Smoke Level  : " + kitchenFire.smokeLevel);
        System.out.println("Heat Level   : " + kitchenFire.heatLevel);
        System.out.println("Spread Speed : " + kitchenFire.spreadSpeed);
        System.out.println("Extinguisher : " + kitchenFire.extinguisherType);
        System.out.println("Effect       : " + kitchenFire.effect);
        System.out.println("-----------------------------");

        // Industrial Fire
        System.out.println("Industrial Fire:");
        System.out.println("Fuel         : " + industrialFire.fuel);
        System.out.println("Location     : " + industrialFire.location);
        System.out.println("Cause        : " + industrialFire.cause);
        System.out.println("Controlled   : " + industrialFire.isControlled);
        System.out.println("Duration     : " + industrialFire.duration);
        System.out.println("Smoke Level  : " + industrialFire.smokeLevel);
        System.out.println("Heat Level   : " + industrialFire.heatLevel);
        System.out.println("Spread Speed : " + industrialFire.spreadSpeed);
        System.out.println("Extinguisher : " + industrialFire.extinguisherType);
        System.out.println("Effect       : " + industrialFire.effect);
        System.out.println("-----------------------------");

        // Electrical Fire
        System.out.println("Electrical Fire:");
        System.out.println("Fuel         : " + electricalFire.fuel);
        System.out.println("Location     : " + electricalFire.location);
        System.out.println("Cause        : " + electricalFire.cause);
        System.out.println("Controlled   : " + electricalFire.isControlled);
        System.out.println("Duration     : " + electricalFire.duration);
        System.out.println("Smoke Level  : " + electricalFire.smokeLevel);
        System.out.println("Heat Level   : " + electricalFire.heatLevel);
        System.out.println("Spread Speed : " + electricalFire.spreadSpeed);
        System.out.println("Extinguisher : " + electricalFire.extinguisherType);
        System.out.println("Effect       : " + electricalFire.effect);
        System.out.println("-----------------------------");

        // Gas Fire
        System.out.println("Gas Fire:");
        System.out.println("Fuel         : " + gasFire.fuel);
        System.out.println("Location     : " + gasFire.location);
        System.out.println("Cause        : " + gasFire.cause);
        System.out.println("Controlled   : " + gasFire.isControlled);
        System.out.println("Duration     : " + gasFire.duration);
        System.out.println("Smoke Level  : " + gasFire.smokeLevel);
        System.out.println("Heat Level   : " + gasFire.heatLevel);
        System.out.println("Spread Speed : " + gasFire.spreadSpeed);
        System.out.println("Extinguisher : " + gasFire.extinguisherType);
        System.out.println("Effect       : " + gasFire.effect);
        System.out.println("-----------------------------");

        // Chemical Fire
        System.out.println("Chemical Fire:");
        System.out.println("Fuel         : " + chemicalFire.fuel);
        System.out.println("Location     : " + chemicalFire.location);
        System.out.println("Cause        : " + chemicalFire.cause);
        System.out.println("Controlled   : " + chemicalFire.isControlled);
        System.out.println("Duration     : " + chemicalFire.duration);
        System.out.println("Smoke Level  : " + chemicalFire.smokeLevel);
        System.out.println("Heat Level   : " + chemicalFire.heatLevel);
        System.out.println("Spread Speed : " + chemicalFire.spreadSpeed);
        System.out.println("Extinguisher : " + chemicalFire.extinguisherType);
        System.out.println("Effect       : " + chemicalFire.effect);
        System.out.println("-----------------------------");

        // Wild Fire
        System.out.println("Wild Fire:");
        System.out.println("Fuel         : " + wildfire.fuel);
        System.out.println("Location     : " + wildfire.location);
        System.out.println("Cause        : " + wildfire.cause);
        System.out.println("Controlled   : " + wildfire.isControlled);
        System.out.println("Duration     : " + wildfire.duration);
        System.out.println("Smoke Level  : " + wildfire.smokeLevel);
        System.out.println("Heat Level   : " + wildfire.heatLevel);
        System.out.println("Spread Speed : " + wildfire.spreadSpeed);
        System.out.println("Extinguisher : " + wildfire.extinguisherType);
        System.out.println("Effect       : " + wildfire.effect);
        System.out.println("-----------------------------");

        // Campfire
        System.out.println("Campfire:");
        System.out.println("Fuel         : " + campfire2.fuel);
        System.out.println("Location     : " + campfire2.location);
        System.out.println("Cause        : " + campfire2.cause);
        System.out.println("Controlled   : " + campfire2.isControlled);
        System.out.println("Duration     : " + campfire2.duration);
        System.out.println("Smoke Level  : " + campfire2.smokeLevel);
        System.out.println("Heat Level   : " + campfire2.heatLevel);
        System.out.println("Spread Speed : " + campfire2.spreadSpeed);
        System.out.println("Extinguisher : " + campfire2.extinguisherType);
        System.out.println("Effect       : " + campfire2.effect);
        System.out.println("-----------------------------");

        // Stove Fire
        System.out.println("Stove Fire:");
        System.out.println("Fuel         : " + stoveFire.fuel);
        System.out.println("Location     : " + stoveFire.location);
        System.out.println("Cause        : " + stoveFire.cause);
        System.out.println("Controlled   : " + stoveFire.isControlled);
        System.out.println("Duration     : " + stoveFire.duration);
        System.out.println("Smoke Level  : " + stoveFire.smokeLevel);
        System.out.println("Heat Level   : " + stoveFire.heatLevel);
        System.out.println("Spread Speed : " + stoveFire.spreadSpeed);
        System.out.println("Extinguisher : " + stoveFire.extinguisherType);
        System.out.println("Effect       : " + stoveFire.effect);
        System.out.println("-----------------------------");

        // Accident Fire
        System.out.println("Accident Fire:");
        System.out.println("Fuel         : " + accidentFire.fuel);
        System.out.println("Location     : " + accidentFire.location);
        System.out.println("Cause        : " + accidentFire.cause);
        System.out.println("Controlled   : " + accidentFire.isControlled);
        System.out.println("Duration     : " + accidentFire.duration);
        System.out.println("Smoke Level  : " + accidentFire.smokeLevel);
        System.out.println("Heat Level   : " + accidentFire.heatLevel);
        System.out.println("Spread Speed : " + accidentFire.spreadSpeed);
        System.out.println("Extinguisher : " + accidentFire.extinguisherType);
        System.out.println("Effect       : " + accidentFire.effect);
        System.out.println("-----------------------------");
    }
}