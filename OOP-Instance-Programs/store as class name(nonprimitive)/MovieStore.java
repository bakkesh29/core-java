class MovieStore {

    Movie[] movies = new Movie[20];
    int index = 0;

    void store(Movie movie) {

        if (movie != null) {

            if (index < movies.length) {
                movies[index] = movie;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Movie cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n------ Movie List ------\n");

        for (Movie m : movies) {
            if (m != null) {
                m.show();
                System.out.println("---------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No movies available");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Movie oldMovie, Movie newMovie) {

        if (oldMovie == null && newMovie == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n-----------update-----------\n");

        for (int i = 0; i < movies.length; i++) {

            if (movies[i] == oldMovie) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldMovie.show();

                movies[i] = newMovie;

                System.out.println("NEW DATA:");
                newMovie.show();

                System.out.println("\n----------------------------\n");

                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("Update failed: data not found in store");
        }
    }
}