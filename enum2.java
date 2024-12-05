import java.util.Scanner;
public enum Level {
    LOW(1), MEDIUM(2), HARD(3);

    private final int value;

    // Constructori int values misaniwheblad
    Level(int value) {
        this.value = value;
    }

    // Getter valuestviss
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter level: ");
        String level = sc.nextLine().toUpperCase();
        Level levelEnum = Level.valueOf(level);

//        Level level = Level.HARD;
//        switch (levelEnum) {
//            case LOW:
//                System.out.println("Low");
//                break;
//            case MEDIUM:
//                System.out.println("Medium");
//                break;
//            case HARD:
//                System.out.println("Hard");
//                break;
//        }

        System.out.println("The value of " + levelEnum + " is: " + levelEnum.getValue());
    }
}
