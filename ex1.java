import java.util.Scanner;

class Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double farenheit = input.nextDouble();
        double celsius = (farenheit - 32) * 5 / 9;
        System.out.println(farenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius.");
    }
}