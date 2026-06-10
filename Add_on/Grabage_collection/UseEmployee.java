import java.lang.ref.Cleaner;

class Employee {

    private int ID;
    private String name;
    private int age;

    private static int nextId = 1;
    private static final Cleaner cleaner = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    // Cleanup task to run when employee becomes unreachable
    private static class State implements Runnable {
        @Override
        public void run() {
            Employee.nextId--;
        }
    }

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;

        // Register cleaner
        cleanable = cleaner.register(this, new State());
    }

    // Display employee details
    public void show() {
        System.out.println("Id = " + ID);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println();
    }

    // Show next ID
    public void showNextId() {
        System.out.println("Next employee id will be = " + nextId);
    }
}

public class UseEmployee {

    public static void main(String[] args) {

        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);

        E.showNextId(); // Expected: 4

        { // Block scope
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);

            // Remove references
            X = null;
            Y = null;

            // Request garbage collection
            System.gc();
        }

        // Give some time for cleaner to execute
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        E.showNextId(); // Expected: 4 (after cleanup)
    }
}