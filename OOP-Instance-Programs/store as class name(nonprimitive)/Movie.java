class Movie {

    String title;
    String director;
    String genre;
    boolean hit;
    int duration;
    double budget;
    String language;
    String country;
    double rating;
    boolean released;

    Movie(String title, String director, String genre, boolean hit,
          int duration, double budget, String language,
          String country, double rating, boolean released) {

        this.title = title;
        this.director = director;
        this.genre = genre;
        this.hit = hit;
        this.duration = duration;
        this.budget = budget;
        this.language = language;
        this.country = country;
        this.rating = rating;
        this.released = released;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Genre: " + this.genre);
        System.out.println("Hit: " + this.hit);
        System.out.println("Duration: " + this.duration);
        System.out.println("Budget: " + this.budget);
        System.out.println("Language: " + this.language);
        System.out.println("Country: " + this.country);
        System.out.println("Rating: " + this.rating);
        System.out.println("Released: " + this.released);
        System.out.println("------------show method ends---------------");
    }
}