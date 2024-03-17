package EnumDemo;
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
public class EnumDemo {
    public static void main(String[] args) {
        String monday = Day.MONDAY.toString();
        System.out.println(monday);
    }
}
