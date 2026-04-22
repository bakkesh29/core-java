public class FamilyRunner {
    public static void main(String... nemadi) {
        
        GrandParent stepson1 = new GrandParent();
        GrandParent son2 = new Parent();
        GrandParent stepson3 = new Child();
        BloodTester tester = new BloodTester();

        tester.testblood(stepson1);
        tester.testblood(son2);
        tester.testblood(stepson3);

    }
}
