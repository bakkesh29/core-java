public class IplTeamRunner {

    public static void main(String[] args) {

        IplTeam t1 = new IplTeam(1, "RCB", "Virat", 0, 1.25);

        IplTeam t2 = new IplTeam(2, "CSK", "Dhoni", 5, 1.80);

        IplTeam t3 = new IplTeam(1, "RCB", "Virat", 0, 1.25);

        boolean nullCheck = t1.equals(null);

        boolean check1 = t1.equals(t2);

        boolean check2 = t1.equals(t3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("t1 equals t2 : " + check1);

        System.out.println("t1 equals t3 : " + check2);
    }
}