class CountryStore {

    Country[] countries = new Country[10];
    int index = 0;

    // saving
    void save(Country country) {

        if (country != null) {

            if (this.index < this.countries.length) {
                this.countries[this.index] = country;
                this.index++;
                System.out.println("Country saved");
            } else {
                System.out.println("Storage full");
            }

        } else {
            System.out.println("Invalid country");
        }
    }

    //find by name
    Country findByName(String name) {

        if (name != null) {

            for (int i = 0; i < this.index; i++) {

                if (this.countries[i] != null && this.countries[i].name == name) {
                    return this.countries[i];
                }
            }
        }

        return null;
    }

    // findsate by statename
    State findStateByStateName(String name) {

        if (name != null) {

            for (int i = 0; i < this.index; i++) {

                State[] states = this.countries[i].states;

                if (states != null) {

                    for (int j = 0; j < states.length; j++) {

                        if (states[j] != null && states[j].name == name) {
                            return states[j];
                        }
                    }
                }
            }
        }

        return null;
    }

    // find all city by statename
    City[] findAllCityByStateName(String name) {

        State state = this.findStateByStateName(name);

        if (state != null) {
            return state.cities;
        }

        return null;
    }

    //Find NoOf Districts By City Name
    int findNoOfDistrictsByCityName(String name) {

        if (name != null) {

            for (int i = 0; i < this.index; i++) {

                State[] states = this.countries[i].states;

                if (states != null) {

                    for (State state : states) {

                        if (state != null && state.cities != null) {

                            for (City city : state.cities) {

                                if (city != null && city.name == name) {
                                    return city.noOfDistricts;
                                }
                            }
                        }
                    }
                }
            }
        }

        return 0;
    }

    //Collector name
    Country findByCollectorName(String collectorName) {

        if (collectorName != null) {

            for (int i = 0; i < this.index; i++) {

                Country country = this.countries[i];

                if (country != null && country.states != null) {

                    for (State state : country.states) {

                        if (state != null && state.cities != null) {

                            for (City city : state.cities) {

                                if (city != null && city.districts != null) {

                                    for (District district : city.districts) {

                                        if (district != null &&
                                            district.collector != null &&
                                            district.collector.name == collectorName) {

                                            return country;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return null;
    }
}