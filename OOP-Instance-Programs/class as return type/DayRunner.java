class DayRunner {
    public static void main(String[] args) {

        DayRun dayRun = new DayRun("January", 31);
        dayRun.dayDetails();

        Day d = dayRun.details();
        d.display();
    }
}