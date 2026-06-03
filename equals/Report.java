class Report {
    private int reportId;
    private String reportName;
    private String author;
    private int totalPages;
    private double reportPrice;
    public Report() {

    }
    public Report(int reportId, String reportName, String author,
                  int totalPages, double reportPrice) {

        this.reportId = reportId;
        this.reportName = reportName;
        this.author = author;
        this.totalPages = totalPages;
        this.reportPrice = reportPrice;
    }

    @Override
    public boolean equals(Object ref) {
        if (ref == null) {
            return false;
        }
        if (ref instanceof Report) {

            if (this.reportId == ((Report) ref).reportId &&
                this.totalPages == ((Report) ref).totalPages &&
                this.reportPrice == ((Report) ref).reportPrice &&
                this.reportName.equals(((Report) ref).reportName) &&
                this.author.equals(((Report) ref).author)) {

                return true;
            }
        }
        return false;
    }
}