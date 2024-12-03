import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in minutes: ");
        int minutes = sc.nextInt();
        int minutesYear = 60 *24 * 365;
        int years = minutes / minutesYear;
        int days = (minutes / 60 / 24) % 365;
        System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
