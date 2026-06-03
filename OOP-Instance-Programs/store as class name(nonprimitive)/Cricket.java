class Cricket {

    String playerName;
    String team;
    int runs;
    int wickets;
    double strikeRate;
    String role;
    boolean captain;
    int matches;
    String country;
    double average;

    Cricket(String playerName, String team, int runs, int wickets,
            double strikeRate, String role, boolean captain,
            int matches, String country, double average) {

        this.playerName = playerName;
        this.team = team;
        this.runs = runs;
        this.wickets = wickets;
        this.strikeRate = strikeRate;
        this.role = role;
        this.captain = captain;
        this.matches = matches;
        this.country = country;
        this.average = average;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Player Name: " + this.playerName);
        System.out.println("Team: " + this.team);
        System.out.println("Runs: " + this.runs);
        System.out.println("Wickets: " + this.wickets);
        System.out.println("Strike Rate: " + this.strikeRate);
        System.out.println("Role: " + this.role);
        System.out.println("Captain: " + this.captain);
        System.out.println("Matches: " + this.matches);
        System.out.println("Country: " + this.country);
        System.out.println("Average: " + this.average);
        System.out.println("------------show method ends---------------");
    }
}