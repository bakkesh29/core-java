class CountryPresidentRunner {
    public static void main(String[] values) {

        //75 countries-array
        String[] countries = {
            "India","USA","France","Germany","Brazil","Russia","China","South Africa","Japan","Italy",
            "UK","Canada","Australia","Nepal","Pakistan","Bangladesh","Sri Lanka","Myanmar","Afghanistan",
            "Spain","Portugal","Mexico","Argentina","Chile","Colombia","Peru","Venezuela","Egypt","Turkey",
            "Saudi Arabia","UAE","Qatar","Iran","Iraq","Israel","Palestine","Jordan","Lebanon","Syria",
            "Sudan","Ethiopia","Kenya","Nigeria","Ghana","Uganda","Tanzania","Zimbabwe","DR Congo","Morocco",
            "Algeria","Tunisia","Libya","Senegal","Mali","Burkina Faso","Cameroon","Ivory Coast","Angola","Mozambique",
            "Madagascar","South Sudan","Thailand","Malaysia","Singapore","Indonesia","Philippines","Vietnam","South Korea","North Korea",
            "Mongolia","Kazakhstan","Uzbekistan","Turkmenistan","Kyrgyzstan","Tajikistan","Georgia","Ukraine","Poland","Hungary",
            "Czech Republic","Slovakia","Austria","Switzerland","Belgium","Netherlands","Norway","Sweden","Denmark","Finland",
            "Ireland","Iceland","Maldives"

            //Maldives not thhere in this this show nt found
        };
        //length

         System.out.println("Total number of countries: " + countries.length);

        // Loop for-each country
        for (String country : countries) {
            System.out.println("\n--- Country Name is : " + country + " ---");
            String president = CountryPresident.getPresident(country);

            if (president != null) {
                System.out.println("President of " + country + " is: " + president);
            } else {
                System.out.println("President not found for " + country);
            }
        }
    }
}
