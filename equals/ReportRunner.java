class ReportRunner {

    public static void main(String[] Bakkesh) {
        Report r1 = new Report(1, "Personal Portfolio Report", "Bakkesh", 120, 350.0);
        Report r2 = new Report(2, "Monthly Report", "Kiran", 80, 300.0);
        Report r3 = new Report(1, "Personal Portfolio Report", "Bakkesh", 120, 350.0);

        System.out.println("Null Check : " + r1.equals(null));

        System.out.println("r1 equals r2 : " + r1.equals(r2));

        System.out.println("r1 equals r3 : " + r1.equals(r3));



    }
}