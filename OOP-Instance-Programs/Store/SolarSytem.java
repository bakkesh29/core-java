class SolarSystem {

    String[] planets = new String[5];
    int index;

    void savePlanet(String name) {
        System.out.println("Trying to save planet");

        if (this.planets != null) {
            System.out.println("Planet name: " + name);

            if (this.index < this.planets.length) {
                this.planets[this.index] = name;
                System.out.println("Planet stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Solar system is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching planet: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.planets.length; i++) {
                if (this.planets[i] == name) {
                    System.out.println("Planet found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Planet not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}