//  Write a Java program to create an 
// enum called "Weekend" with constants representing 
// the days of the weekend.


public class Exercise {
    public enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        Days today = Days.TUESDAY;
        System.out.println(today);
    }
}