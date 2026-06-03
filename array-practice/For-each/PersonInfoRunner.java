class PersonInfoRunner {
    public static void main(String[] args) {

        //  array of names
        String[] names = {
            "Bakkesh Y MR","Spandana","Yashashwini","Suraj","Suchit",
            "Bhargav","Prajwal","Bharat","Anusha","Anish",
            "Gagan","Dhruva","Harsha","Amith","Rahul",
            "Lakshmi","Vijetha","Pooja","Prajwala","Thanmay"
        };

        //for eachLoop name
        for (String name : names) {
            System.out.println("\n--- Details for: " + name + " ---");

            // invoke (classname.method)PersonInfo.getPersonDetails
            String[] details = PersonInfo.getPersonDetails(name);

            //details
            if (details != null) {
                System.out.println("Total fields: " + details.length);
                for (String ref : details) {
                    System.out.println(ref);
                }
            } else {
                System.out.println("Person not found");
            }
        }
    }
}
