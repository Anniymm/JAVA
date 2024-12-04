import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String digits = Integer.toString(number);
//        System.out.println(digits.getClass());
        int[] intArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            intArray[i] = Integer.parseInt(Character.toString(digits.charAt(i)));
            System.out.print(intArray[i] + " " );
        }
        
    }
}
