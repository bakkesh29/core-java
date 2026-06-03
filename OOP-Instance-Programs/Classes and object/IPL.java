class IPL {
    String sponsor;
    int teams;
    String format;
    int matches;
    String country;
    String winner;
    int year;
    String organizer;
    boolean active;
    String trophyName;

    // Parameterized Constructor
    IPL(String sponsor, int teams, String format, int matches,
        String country, String winner, int year,
        String organizer, boolean active, String trophyName) {

        this.sponsor = sponsor;
        this.teams = teams;
        this.format = format;
        this.matches = matches;
        this.country = country;
        this.winner = winner;
        this.year = year;
        this.organizer = organizer;
        this.active = active;
        this.trophyName = trophyName;
    }

    // display method
    void display() {
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Teams: " + teams);
        System.out.println("Format: " + format);
        System.out.println("Matches: " + matches);
        System.out.println("Country: " + country);
        System.out.println("Winner: " + winner);
        System.out.println("Year: " + year);
        System.out.println("Organizer: " + organizer);
        System.out.println("Active: " + active);
        System.out.println("Trophy: " + trophyName);
        System.out.println("========================");
    }
}