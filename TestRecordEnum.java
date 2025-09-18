// Record definition for Employee
record Employee(String name, double salary) {}

// Enum definition for Department
enum Department {
    HR, IT, FINANCE
}

// Main class
public class TestRecordEnum {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000);
        Employee e2 = new Employee("Bob", 60000);

        // Display employees
        System.out.println(e1);
        System.out.println(e2);

        // Display a department
        System.out.println("Department: " + Department.IT);
    }
}
