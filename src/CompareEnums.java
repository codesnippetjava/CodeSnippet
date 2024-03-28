public class CompareEnums {
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        DayOfWeek enum1 = DayOfWeek.MONDAY;
        DayOfWeek enum2 = DayOfWeek.MONDAY;

        if(enum1==enum2){
            System.out.println("==");
        }

    }

     /*   public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }*/
}
