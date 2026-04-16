class MovieRunner {
    public static void main(String... args) {

        MovieStore store = new MovieStore();

        Movie movieA = new Movie("KGF", "Prashanth Neel", "Action", true, 150, 100, "Kannada", "India", 8.5, true);
        Movie movieB = new Movie("RRR", "S S Rajamouli", "Action", true, 180, 200, "Telugu", "India", 8.8, true);
        Movie movieC = new Movie("Inception", "Christopher Nolan", "Sci-Fi", true, 148, 160, "English", "USA", 9.0,
                true);
        Movie movieD = new Movie("Avatar", "James Cameron", "Sci-Fi", true, 162, 250, "English", "USA", 8.7, true);
        Movie movieE = new Movie("Joker", "Todd Phillips", "Drama", true, 122, 55, "English", "USA", 8.9, true);

        Movie movieF = new Movie("Leo", "Lokesh", "Action", true, 160, 120, "Tamil", "India", 8.0, true);
        Movie movieG = new Movie("Master", "Lokesh", "Action", true, 155, 130, "Tamil", "India", 7.8, true);
        Movie movieH = new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", true, 169, 165, "English", "USA", 9.2,
                true);
        Movie movieI = new Movie("Bahubali", "S S Rajamouli", "Epic", true, 170, 180, "Telugu", "India", 8.6, true);
        Movie movieJ = new Movie("Titanic", "James Cameron", "Romance", true, 195, 200, "English", "USA", 8.4, true);

        Movie movieK = new Movie("Pushpa", "Sukumar", "Action", true, 160, 110, "Telugu", "India", 8.2, true);
        Movie movieL = new Movie("Doctor Strange", "Scott Derrickson", "Fantasy", true, 115, 165, "English", "USA", 7.5,
                true);
        Movie movieM = new Movie("Endgame", "Russo Brothers", "Superhero", true, 181, 356, "English", "USA", 9.1, true);
        Movie movieN = new Movie("SpiderMan", "Jon Watts", "Superhero", true, 140, 200, "English", "USA", 8.3, true);
        Movie movieO = new Movie("Dangal", "Nitesh Tiwari", "Sports", true, 161, 70, "Hindi", "India", 8.9, true);

        Movie movieP = new Movie("3 Idiots", "Rajkumar Hirani", "Drama", true, 170, 55, "Hindi", "India", 9.0, true);
        Movie movieQ = new Movie("KGF 2", "Prashanth Neel", "Action", true, 168, 120, "Kannada", "India", 8.7, true);
        Movie movieR = new Movie("Pathaan", "Siddharth Anand", "Action", true, 146, 250, "Hindi", "India", 7.5, true);
        Movie movieS = new Movie("Jawan", "Atlee", "Action", true, 150, 200, "Hindi", "India", 7.8, true);
        Movie movieT = new Movie("Salaar", "Prashanth Neel", "Action", true, 175, 250, "Telugu", "India", 8.4, true);

        // storing
        store.store(movieA);
        store.store(movieB);
        store.store(movieC);
        store.store(movieD);
        store.store(movieE);
        store.store(movieF);
        store.store(movieG);
        store.store(movieH);
        store.store(movieI);
        store.store(movieJ);
        store.store(movieK);
        store.store(movieL);
        store.store(movieM);
        store.store(movieN);
        store.store(movieO);
        store.store(movieP);
        store.store(movieQ);
        store.store(movieR);
        store.store(movieS);
        store.store(movieT);

        // updating
        store.update(movieA,
                new Movie("KGF Updated", "Prashanth Neel", "Action", true, 155, 110, "Kannada", "India", 8.6, true));
        store.update(movieJ, new Movie("Titanic Remastered", "James Cameron", "Romance", true, 200, 220, "English",
                "USA", 8.5, true));

        // display
        store.display();
    }
}