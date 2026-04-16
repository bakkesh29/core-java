class SilencerRunner {
    public static void main(String... args) {

        SilencerStore store = new SilencerStore();

        Silencer silencerA = new Silencer("Steel", 2.5, "Standard", true, 5, 3000, "Bosch", "Bike", true, 40);
        Silencer silencerB = new Silencer("Aluminum", 1.8, "Sport", true, 4, 4500, "Yamaha", "Bike", true, 35);
        Silencer silencerC = new Silencer("Iron", 3.0, "Heavy", false, 6, 2500, "TVS", "Car", false, 45);
        Silencer silencerD = new Silencer("Steel", 2.2, "Standard", true, 5, 3200, "Honda", "Bike", true, 38);
        Silencer silencerE = new Silencer("Titanium", 1.5, "Racing", true, 7, 7000, "KTM", "Bike", true, 30);

        Silencer silencerF = new Silencer("Aluminum", 1.9, "Sport", true, 4, 4600, "Suzuki", "Bike", true, 36);
        Silencer silencerG = new Silencer("Steel", 2.7, "Standard", true, 5, 3100, "Hero", "Bike", true, 42);
        Silencer silencerH = new Silencer("Iron", 3.5, "Heavy", false, 6, 2600, "Mahindra", "Car", false, 50);
        Silencer silencerI = new Silencer("Titanium", 1.6, "Racing", true, 7, 7200, "BMW", "Car", true, 32);
        Silencer silencerJ = new Silencer("Steel", 2.4, "Standard", true, 5, 3300, "Audi", "Car", true, 41);

        Silencer silencerK = new Silencer("Aluminum", 1.7, "Sport", true, 4, 4400, "Ford", "Car", true, 37);
        Silencer silencerL = new Silencer("Steel", 2.6, "Standard", true, 5, 3050, "Hyundai", "Car", true, 39);
        Silencer silencerM = new Silencer("Iron", 3.2, "Heavy", false, 6, 2550, "Tata", "Car", false, 48);
        Silencer silencerN = new Silencer("Titanium", 1.4, "Racing", true, 7, 7500, "Ferrari", "Car", true, 29);
        Silencer silencerO = new Silencer("Steel", 2.3, "Standard", true, 5, 3150, "Kia", "Car", true, 40);

        Silencer silencerP = new Silencer("Aluminum", 1.8, "Sport", true, 4, 4550, "Nissan", "Car", true, 36);
        Silencer silencerQ = new Silencer("Steel", 2.5, "Standard", true, 5, 3200, "Renault", "Car", true, 42);
        Silencer silencerR = new Silencer("Iron", 3.3, "Heavy", false, 6, 2700, "Jeep", "Car", false, 49);
        Silencer silencerS = new Silencer("Titanium", 1.5, "Racing", true, 7, 7600, "Lamborghini", "Car", true, 31);
        Silencer silencerT = new Silencer("Steel", 2.4, "Standard", true, 5, 3300, "Skoda", "Car", true, 43);

        // storing
        store.store(silencerA); store.store(silencerB); store.store(silencerC); store.store(silencerD); store.store(silencerE);
        store.store(silencerF); store.store(silencerG); store.store(silencerH); store.store(silencerI); store.store(silencerJ);
        store.store(silencerK); store.store(silencerL); store.store(silencerM); store.store(silencerN); store.store(silencerO);
        store.store(silencerP); store.store(silencerQ); store.store(silencerR); store.store(silencerS); store.store(silencerT);

        // updating
        store.update(silencerA, new Silencer("Updated", 2.0, "Sport", true, 6, 5000, "UpdatedBrand", "Bike", true, 35));
        store.update(silencerJ, new Silencer("Ultra", 1.5, "Racing", true, 7, 9000, "UltraBrand", "Car", true, 30));

        // display
        store.display();
    }
}