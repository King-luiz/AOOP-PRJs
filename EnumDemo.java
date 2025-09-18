// Enum definition
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

// Main class
public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.TUESDAY;
        if (today == Day.MONDAY) {
            System.out.println("Start of the week!");
        }
        System.out.println("Today is: " + today);
    }
}
