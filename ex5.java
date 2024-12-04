import java.util.Scanner;
public class Operations2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();
// %10it vsazgvravt ramxela sigrdze unda qondes outputs, magalitad 5**2 aris 25 da 10mde
// rom gazardos daamatebs spacebs-s marcxnidan da .2fi chveulebriv mdzimis mere avighebt 2 cifrs
// gamoiteneba wakitxvadobistvis ))
        System.out.printf("Square: %10.2f\n", val * val);
        System.out.printf("Cube: %10.2f\n", val * val * val);
        System.out.printf("Fourth: %10.2f\n", Math.pow(val, 4));
    }
}
