class BuildingConstructor {

    String architectName;
    String chiefEngineerName;
    int noOfWorkers;
    Monitor monitor;   //other class name
    Type type;         //enum

    BuildingConstructor(String architectName, String chiefEngineerName, int noOfWorkers, Monitor monitor, Type type) {
        this.architectName = architectName;
        this.chiefEngineerName = chiefEngineerName;
        this.noOfWorkers = noOfWorkers;
        this.monitor = monitor;
        this.type = type;
    }

    //returntype->void,name->show

    void show() {
        System.out.println("Architect Name: " + this.architectName);
        System.out.println("Chief Engineer Name: " + this.chiefEngineerName);
        System.out.println("No Of Workers: " + this.noOfWorkers);
        System.out.println("Building Type: " + this.type);

        //Is Null or not
        //null check
        //monitor present or not?
        if (this.monitor != null) {
            //display method inside monitor class
            this.monitor.display();
        } else {
            //monitor null print
            System.out.println("Monitor is null");
        }
    }
}