import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // clear buffer
        return scanner.nextLine();
    }
}
