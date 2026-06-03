class CricketRunner {
    public static void main(String... args) {

        CricketStore store = new CricketStore();

        Cricket cricketA = new Cricket("Virat Kohli", "RCB", 8000, 5, 130.5, "Batsman", true, 250, "India", 50.5);
        Cricket cricketB = new Cricket("MS Dhoni", "CSK", 5000, 1, 120.0, "Wicket Keeper", true, 300, "India", 45.0);
        Cricket cricketC = new Cricket("Rohit Sharma", "MI", 7000, 2, 135.0, "Batsman", true, 280, "India", 48.0);
        Cricket cricketD = new Cricket("Hardik Pandya", "GT", 4000, 50, 140.0, "All-rounder", true, 200, "India", 35.0);
        Cricket cricketE = new Cricket("Jadeja", "CSK", 3000, 150, 125.0, "All-rounder", false, 220, "India", 32.0);

        Cricket cricketF = new Cricket("Bumrah", "MI", 500, 250, 90.0, "Bowler", false, 180, "India", 20.0);
        Cricket cricketG = new Cricket("Shami", "GT", 400, 270, 85.0, "Bowler", false, 170, "India", 18.0);
        Cricket cricketH = new Cricket("Warner", "DC", 6000, 5, 140.0, "Batsman", true, 260, "Australia", 45.0);
        Cricket cricketI = new Cricket("Smith", "RR", 5500, 10, 130.0, "Batsman", false, 240, "Australia", 42.0);
        Cricket cricketJ = new Cricket("Buttler", "RR", 6500, 2, 150.0, "Wicket Keeper", false, 230, "England", 47.0);

        Cricket cricketK = new Cricket("Stokes", "CSK", 5000, 120, 135.0, "All-rounder", false, 210, "England", 40.0);
        Cricket cricketL = new Cricket("Root", "ENG", 7500, 15, 125.0, "Batsman", false, 260, "England", 52.0);
        Cricket cricketM = new Cricket("Kane", "SRH", 6800, 5, 128.0, "Batsman", true, 250, "New Zealand", 49.0);
        Cricket cricketN = new Cricket("Boult", "RR", 300, 220, 88.0, "Bowler", false, 190, "New Zealand", 22.0);
        Cricket cricketO = new Cricket("Maxwell", "RCB", 4500, 80, 150.0, "All-rounder", false, 200, "Australia", 38.0);

        Cricket cricketP = new Cricket("ABD", "RCB", 9000, 10, 155.0, "Batsman", false, 300, "South Africa", 55.0);
        Cricket cricketQ = new Cricket("Rabada", "DC", 200, 240, 92.0, "Bowler", false, 180, "South Africa", 25.0);
        Cricket cricketR = new Cricket("Gayle", "PBKS", 10000, 5, 160.0, "Batsman", false, 350, "West Indies", 60.0);
        Cricket cricketS = new Cricket("Pollard", "MI", 6000, 70, 145.0, "All-rounder", false, 280, "West Indies",
                42.0);
        Cricket cricketT = new Cricket("Narine", "KKR", 1500, 180, 135.0, "All-rounder", false, 260, "West Indies",
                30.0);

        // storing
        store.store(cricketA);
        store.store(cricketB);
        store.store(cricketC);
        store.store(cricketD);
        store.store(cricketE);
        store.store(cricketF);
        store.store(cricketG);
        store.store(cricketH);
        store.store(cricketI);
        store.store(cricketJ);
        store.store(cricketK);
        store.store(cricketL);
        store.store(cricketM);
        store.store(cricketN);
        store.store(cricketO);
        store.store(cricketP);
        store.store(cricketQ);
        store.store(cricketR);
        store.store(cricketS);
        store.store(cricketT);

        // updating
        store.update(cricketA,
                new Cricket("Updated Player", "India", 9000, 20, 140.0, "All-rounder", true, 300, "India", 60.0));
        store.update(cricketJ,
                new Cricket("Ultra Player", "England", 7000, 15, 155.0, "Batsman", false, 250, "England", 55.0));

        // display
        store.display();
    }
}