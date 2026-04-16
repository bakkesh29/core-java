class NewsPaper {

    Lang lang;
    String paperQuality;
    double price;
    int noOfPages;
    String name;
    double height;
    double weight;
    String headerText;
    String footerText;
    int fontSize;
    int noOfImages;
    String headEditor;
    String printHouseAddress;
    InkColor inkColor;
    int noOfContents;

    NewsPaper(Lang lang, String paperQuality, double price, int noOfPages, String name,
              double height, double weight, String headerText, String footerText,
              int fontSize, int noOfImages, String headEditor,
              String printHouseAddress, InkColor inkColor, int noOfContents) {

        this.lang = lang;
        this.paperQuality = paperQuality;
        this.price = price;
        this.noOfPages = noOfPages;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.headerText = headerText;
        this.footerText = footerText;
        this.fontSize = fontSize;
        this.noOfImages = noOfImages;
        this.headEditor = headEditor;
        this.printHouseAddress = printHouseAddress;
        this.inkColor = inkColor;
        this.noOfContents = noOfContents;
    }
}