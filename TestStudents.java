//Example 1: Class with Instance and Static Members
// Student class definition
class Student {
    String name;        // Instance field
    int age;            // Instance field
    static int total = 0; // Static field

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        total++;
    }

    // Instance method to display student details
    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    // Static method to display total number of students
    static void displayTotal() {
        System.out.println("Total students: " + total);
    }
}

// Main class
public class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        s1.display();
        s2.display();

        Student.displayTotal();
    }
}