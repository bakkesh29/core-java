class CountryRunner {

    public static void main(String[] args) {
        
        Address address = new Address(101, 560001);

        // President
        President president = new President("Modi", 73, address);

        // Collector
        Collector collector1 = new Collector("Ravi", 2010);
        Collector collector2 = new Collector("Kiran", 2012);

        // Districts
        District district1 = new District("District1", collector1);
        District district2 = new District("District2", collector2);

        District[] districts = { district1, district2 };

        // City
        City city1 = new City("Bangalore", 2, districts);
        City[] cities = { city1 };

        // State
        State state1 = new State("Karnataka", 1000000, cities);
        State[] states = { state1 };

        // Country
        Country country = new Country("India", president, states);

        // Store
        CountryStore store = new CountryStore();
        store.save(country);

        // 1. Finding Country by Name
        Country foundCountry = store.findByName("India");

        if (foundCountry != null) {
            System.out.println(foundCountry.name);
        } else {
            System.out.println("Not Found");
        }

        State foundState = store.findStateByStateName("Karnataka");

        if (foundState != null) {
            System.out.println(foundState.name);
        } else {
            System.out.println("Not Found");
        }
        // 3. Finding Cities
        City[] foundCities = store.findAllCityByStateName("Karnataka");
        if (foundCities != null) {
            for (City c : foundCities) {
                System.out.println(c.name);
            }
        }

        // 4. Finding District Count
        int count = store.findNoOfDistrictsByCityName("Bangalore");
        System.out.println("Districts: " + count);

        // 5. Finding Country by Collector Name
        String collectorName = "Ravi";

        Country result = store.findByCollectorName(collectorName);

        if (result != null) {

            System.out.println("Country: " + result.name);

            for (State state : result.states) {
                for (City city : state.cities) {
                    for (District district : city.districts) {

                        if (district.collector.name == collectorName) {
                            System.out.println("Collector Found: " + district.collector.name);
                            System.out.println("District: " + district.name);
                            System.out.println("City: " + city.name);
                            System.out.println("State: " + state.name);
                        }
                    }
                }
            }

        } else {
            System.out.println("Country Not Found");
        }
    }
}