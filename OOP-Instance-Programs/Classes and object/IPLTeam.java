class IPLTeam {
    String name;
    String captain;
    String coach;
    int titles;
    String homeGround;
    String owner;
    String color;
    int players;
    boolean qualified;
    String sponsor;

    // Parameterized Constructor
    IPLTeam(String name, String captain, String coach, int titles,
            String homeGround, String owner, String color,
            int players, boolean qualified, String sponsor) {

        this.name = name;
        this.captain = captain;
        this.coach = coach;
        this.titles = titles;
        this.homeGround = homeGround;
        this.owner = owner;
        this.color = color;
        this.players = players;
        this.qualified = qualified;
        this.sponsor = sponsor;
    }

    // display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Captain: " + captain);
        System.out.println("Coach: " + coach);
        System.out.println("Titles: " + titles);
        System.out.println("Home Ground: " + homeGround);
        System.out.println("Owner: " + owner);
        System.out.println("Color: " + color);
        System.out.println("Players: " + players);
        System.out.println("Qualified: " + qualified);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("========================");
    }
}