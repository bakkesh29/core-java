class NewsPaperStore {
    NewsPaper[] newsPapers = new NewsPaper[100];
    int index = 0;

    // save single newspaper
    void save(NewsPaper newsPaper) {
        System.out.println("trying to save newspaper");
        if (newsPaper != null) {
            if (index < newsPapers.length) {
                newsPapers[index++] = newsPaper;
                System.out.println("Saved successfully");
            } else {
                System.out.println("Storage full");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    // save multiple newspapers
    void saveAll(NewsPaper[] newsPapersArray) {
        System.out.println("trying to saveall newspaper");
        if (newsPapersArray != null) {
            for (NewsPaper newsPaper : newsPapersArray) {
                if (newsPaper != null) {
                    save(newsPaper);
                } else {
                    System.out.println("Skipping null");
                }
            }
        } else {
            System.out.println("Array is null");
        }
    }

    // find by name
    NewsPaper findByName(String name) {
        System.out.println("trying to find newspaper");
        if (name != null) {
            for (NewsPaper newsPaper : newsPapers) {
                if (newsPaper != null && newsPaper.name != null && newsPaper.name == name) {
                    return newsPaper;
                }
            }
        } else {
            System.out.println("Name is null");
        }
        return null;
    }

    // display all
    void displayAll() {
        System.out.println("trying to displayall newspaper");
        if (newsPapers != null) {
            for (NewsPaper newsPaper : newsPapers) {
                if (newsPaper != null) {
                    System.out.println(newsPaper.name + " | " + newsPaper.price);
                }
            }
        } else {
            System.out.println("Store is null");
        }
    }

    // find paper quality
    String findPaperQualityByName(String name) {
        System.out.println("trying to Find paper quality by name newspaper");
        if (name != null) {
            NewsPaper newsPaper = findByName(name);
            if (newsPaper != null) {
                return newsPaper.paperQuality;
            }
        } else {
            System.out.println("Name is null");
        }
        return "Not Found";
    }

    //finding pages
    int findNoOfPagesByNameAndHeadEditor(String name, String headEditor) {
        System.out.println("trying to findNoOfPagesByNameAndHeadEditor newspaper");
        if (name != null && headEditor != null) {
            for (NewsPaper newsPaper : newsPapers) {
                if (newsPaper != null && newsPaper.name != null && newsPaper.headEditor != null
                        && newsPaper.name == name && newsPaper.headEditor == headEditor) {
                    return newsPaper.noOfPages;
                }
            }
        } else {
            System.out.println("Inputs are null");
        }
        return 0;
    }

    // update lang
    boolean updateLangByName(String name, Lang newLang) {
        System.out.println("trying to updateLangByName");
        if (name != null && newLang != null) {
            NewsPaper newsPaper = findByName(name);
            if (newsPaper != null) {
                newsPaper.lang = newLang;
                return true;
            }
        } else {
            System.out.println("Inputs are null");
        }
        return false;
    }



    // update multiple fields
    boolean updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
            InkColor inkColor, int noOfImages, int fontSize,
            String name, double height, double weight) {

        if (inkColor != null && name != null) {
            for (NewsPaper newsPaper : newsPapers) {
                if (newsPaper != null && newsPaper.name != null
                        && newsPaper.name == name
                        && newsPaper.height == height
                        && newsPaper.weight == weight) {

                    newsPaper.inkColor = inkColor;
                    newsPaper.noOfImages = noOfImages;
                    newsPaper.fontSize = fontSize;
                    return true;
                }
            }
        } else {
            System.out.println("Inputs are null");
        }
        return false;
    }




    // replace
    boolean replaceByPrintHouseAddress(String printHouseAddress, NewsPaper newsPaper) {
        if (printHouseAddress != null && newsPaper != null) {
            for (int i = 0; i < newsPapers.length; i++) {
                if (newsPapers[i] != null && newsPapers[i].printHouseAddress != null
                        && newsPapers[i].printHouseAddress == printHouseAddress) {

                    newsPapers[i] = newsPaper;
                    return true;
                }
            }
        } else {
            System.out.println("Inputs are null");
        }
        return false;
    }
}