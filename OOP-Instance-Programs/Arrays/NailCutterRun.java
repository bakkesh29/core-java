class NailCutterRunner {
    public static void main(String[] args) {

        Username username1 = new Username("Bakkesh", NailType.GLOSSY, 18);
        Username username2 = new Username("Dhruva", NailType.SHINY, 7);
        Username username3 = new Username("Gagan", NailType.MATTE, 77);

        Username[] usernames = {username1, username2, username3};

        NailCutter nailcutter = new NailCutter("Metal","Sivate",usernames);

        nailcutter.display();
    }
}