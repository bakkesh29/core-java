class FlightRunner {
    public static void main(String[] args) {

        Flight indigo = new Flight();
        Flight airIndia = new Flight();
        Flight spiceJet = new Flight();
        Flight vistara = new Flight();
        Flight akasa = new Flight();

        System.out.println("\n--- Default Values ---\n");

        System.out.println(indigo.airline + " " + indigo.source + " " + indigo.destination + " " + indigo.price + " "
                + indigo.available);
        System.out.println(airIndia.airline + " " + airIndia.source + " " + airIndia.destination + " " + airIndia.price
                + " " + airIndia.available);
        System.out.println(spiceJet.airline + " " + spiceJet.source + " " + spiceJet.destination + " " + spiceJet.price
                + " " + spiceJet.available);
        System.out.println(vistara.airline + " " + vistara.source + " " + vistara.destination + " " + vistara.price
                + " " + vistara.available);
        System.out.println(akasa.airline + " " + akasa.source + " " + akasa.destination + " " + akasa.price + " "
                + akasa.available);

        // Assign values
        indigo.airline = "Indigo";
        indigo.source = "Bangalore";
        indigo.destination = "Delhi";
        indigo.price = 7000;
        indigo.available = true;

        airIndia.airline = "AirIndia";
        airIndia.source = "Mumbai";
        airIndia.destination = "Chennai";
        airIndia.price = 6500;
        airIndia.available = true;

        spiceJet.airline = "SpiceJet";
        spiceJet.source = "Hyderabad";
        spiceJet.destination = "Goa";
        spiceJet.price = 5000;
        spiceJet.available = false;

        vistara.airline = "Vistara";
        vistara.source = "Delhi";
        vistara.destination = "Kolkata";
        vistara.price = 8000;
        vistara.available = true;
        
        akasa.airline = "Akasa";
        akasa.source = "Pune";
        akasa.destination = "Bangalore";
        akasa.price = 6000;
        akasa.available = true;

        System.out.println("\n--- Updated Values ---\n");

        System.out.println(indigo.airline + " " + indigo.source + " " + indigo.destination + " " + indigo.price + " "
                + indigo.available);
        System.out.println(airIndia.airline + " " + airIndia.source + " " + airIndia.destination + " " + airIndia.price
                + " " + airIndia.available);
        System.out.println(spiceJet.airline + " " + spiceJet.source + " " + spiceJet.destination + " " + spiceJet.price
                + " " + spiceJet.available);
        System.out.println(vistara.airline + " " + vistara.source + " " + vistara.destination + " " + vistara.price
                + " " + vistara.available);
        System.out.println(akasa.airline + " " + akasa.source + " " + akasa.destination + " " + akasa.price + " "
                + akasa.available);
    }
}