import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Convert the number to a string
        String numberStr = Integer.toString(number);
//        System.out.println(numberStr.getClass().getName());

        // Create an array or ArrayList to store the digits
        ArrayList<Integer> digits = new ArrayList<>();

        // Split the number and add each digit to the array
//        numberStr.toCharArray()-it gadavaqcevt '123's ['1',...
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            digits.add(digit);
        }

        // Calculate the sum of all digits
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
