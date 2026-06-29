import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProcessor {
    
    record Employee(String name, String department, double salary) {}

    public static void main(String[] args) {
        List<Employee> roster = List.of(
            new Employee("Alice", "Engineering", 115000),
            new Employee("Bob", "Marketing", 75000),
            new Employee("Charlie", "Engineering", 95000),
            new Employee("David", "Sales", 60000),
            new Employee("Eva", "Engineering", 130000)
        );

        // 1. Filter, transform and find a statistical marker
        double averageEngineeringSalary = roster.stream()
            .filter(emp -> "Engineering".equalsIgnoreCase(emp.department()))
            .mapToDouble(Employee::salary)
            .average()
            .orElse(0.0);

        System.out.println("Average Engineering Salary: $" + averageEngineeringSalary);

        // 2. Complex Grouping: Group employee names by their department
        Map<String, List<String>> employeesByDept = roster.stream()
            .collect(Collectors.groupingBy(
                Employee::department,
                Collectors.mapping(Employee::name, Collectors.toList())
            ));

        System.out.println("Department Roster: " + employeesByDept);
    }
}
