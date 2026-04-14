class LibraryStoreRunner {

    public static void main(String[] args) {

        LibraryStore libraryStore = new LibraryStore();

        // Saving books
        libraryStore.saveBook("Harry Potter");
        libraryStore.saveBook("5 AM Club");
        libraryStore.saveBook("Rich Dad Poor Dad");
        libraryStore.saveBook("The Monk Who Sold His Ferrari");
        libraryStore.saveBook("the pyscology of money"); 

        //Searching it
        libraryStore.search("Harry Potter");        
        libraryStore.search("Rich Dad Poor Dad");  
        libraryStore.search("Atomic Habits");       
    }
}