import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();

        System.out.printf("Sum is %d%n", a + b);
        System.out.printf("dif is %d%n", a - b);
    }
}
