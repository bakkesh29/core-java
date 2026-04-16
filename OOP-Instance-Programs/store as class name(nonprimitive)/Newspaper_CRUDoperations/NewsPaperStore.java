class NewsPaperStore {

    //instance variables
    // array is to store newspapers
    NewsPaper[] newspapers = new NewsPaper[100];
    // index is to store position
    int index;

    // save one newspaper
    void save(NewsPaper newsPaper) {

        // null check
        if (newsPaper != null) {
            // checking space 
            if (index < newspapers.length) {
                // store newspaper
                this.newspapers[index] = newsPaper;
                System.out.println("newspaper saved at index " + index);
                // increase index
                index++;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println("NewsPaper is null");
        }
    }

    // save many newspapers
    void saveAll(NewsPaper[] newsPapers) {
        System.out.println("\n-saving all operation-\n");
        // using for each loop for all papers
        for (NewsPaper paper : newsPapers) {
            // call save method
            save(paper);
        }
        System.out.println("\n-end of save all-\n");
    }

    // finding newspaper by name
    NewsPaper findByName(String name) {
        //null check
        if (name != null) {
            // for loop-> array
            for (int start = 0; start < this.newspapers.length; start++) {
                NewsPaper paper = this.newspapers[start];
                // check match
                if (paper != null && paper.name == name) {
                    System.out.println("NewsPaper found");
                    // print details
                    //calling show method in np.java 
                    paper.show();
                    return paper;
                }
            }
        }
        System.out.println("NewsPaper not found");
        return null;
    }

    // display all newspapers
    void displayAll() {
        System.out.println("\n--- DISPLAY ALL ---\n");
        boolean found = false;

        // for each loop all
        for (NewsPaper paper : this.newspapers) {
            // print only if not null
            if (paper != null) {
                paper.show();
                found = true;
            }
        }

        // ifnothing found
        if (!found) {
            System.out.println("No NewsPapers");
        }
        System.out.println("\n--- END DISPLAY ---\n");
    }

    // finding paper quality using name
    String findPaperQualityByName(String name) {

        if (name != null) {

            for (int start = 0; start < this.newspapers.length; start++) {

                NewsPaper paper = this.newspapers[start];

                // check name match
                if (paper != null && paper.name == name) {
                    System.out.println("Paper found");
                    System.out.println("Quality: " + paper.paperQuality);
                    return paper.paperQuality;
                }
            }
        }
        System.out.println("Not found");
        return null;
    }

    // find pages using name and editor
    int findNoOfPagesByNameAndHeadEditor(String name, String headEditor) {

        // check inputs null check
        if (name != null && headEditor != null) {
            for (int start = 0; start < this.newspapers.length; start++) {
                NewsPaper paper = this.newspapers[start];

                // check both match
                if (paper != null && paper.name == name && paper.headEditor == headEditor) {
                    System.out.println("Found");
                    System.out.println("Pages: " + paper.noOfPages);
                    return paper.noOfPages;
                }
            }
        }
        System.out.println("Not found");
        return 0;
    }

    // update language using name
    void updateLangByName(String name, Lang newLang) {
        System.out.println("updating language");
        // check inputs
        if (name != null && newLang != null) {
            for (NewsPaper paper : this.newspapers) {
                // check match
                if (paper != null && paper.name == name) {
                    // update value
                    paper.lang = newLang;
                    System.out.println("Updated");
                    paper.show();
                }
            }

        } else {
            System.out.println("Invalid input");
        }
    }

    // update multiple values
    void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
            InkColor inkColor, int noOfImages, int fontSize,
            String name, double height, double weight) {

        System.out.println("\n--- UPDATE ---\n");

        boolean updated = false;

        // check inputs
        if (inkColor != null && name != null && height > 0 && weight > 0) {
            for (int start = 0; start < this.newspapers.length; start++) {
                NewsPaper paper = this.newspapers[start];
                // check all conditions
                if (paper != null && paper.name == name && paper.height == height && paper.weight == weight) {
                    // update values
                    paper.inkColor = inkColor;
                    paper.noOfImages = noOfImages;
                    paper.fontSize = fontSize;
                    System.out.println("Updated");
                    paper.show();
                    updated = true;
                }
            }
            if (!updated) {
                System.out.println("No match found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
    // replace using print house address
    void replaceByPrintHouseAddress(String printHouseAddress, NewsPaper newsPaper) {
        boolean replaced = false;
        System.out.println("\n--- REPLACE ---\n");
        // check inputs
        if (printHouseAddress != null && newsPaper != null) {

            for (int start = 0; start < this.newspapers.length; start++) {
                // checking match
                if (this.newspapers[start] != null &&
                        this.newspapers[start].printHouseAddress == printHouseAddress) {

                    // replace
                    this.newspapers[start] = newsPaper;
                    System.out.println("Replaced");
                    replaced = true;
                }
            }
            if (!replaced) {
                System.out.println("No match found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}