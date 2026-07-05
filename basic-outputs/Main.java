// Parent Class (Superclass)
class Employee {
    String name;
    double salary;

    // Parent method
    void work() {
        System.out.println(name + " is working.");
    }
}

// Child Class (Subclass) inheriting from Employee
class Developer extends Employee {
    String programmingLanguage;

    // Child method
    void writeCode() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Developer dev = new Developer();

        // Accessing fields (both inherited and unique)
        dev.name = "Alice";                 // Inherited from Employee
        dev.salary = 85000.00;             // Inherited from Employee
        dev.programmingLanguage = "Java";   // Unique to Developer

        // Calling methods
        dev.work();       // Calling inherited parent method
        dev.writeCode();  // Calling child specific method
        
        System.out.println(dev.name + "'s salary is $" + dev.salary);
    }
}
