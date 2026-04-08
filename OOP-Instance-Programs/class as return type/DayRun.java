class DayRun {

    String month;
    int totalDays;

    DayRun(String month, int totalDays) {
        this.month = month;
        this.totalDays = totalDays;
    }

    void dayDetails() {
        System.out.println("Month : " + this.month);
        System.out.println("Total Days : " + this.totalDays);
    }

    public Day details() {
        Day day = new Day("Monday", 24, "Weekday");
        return day;
    }
}