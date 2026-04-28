import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterText = scanner.nextLine();
        System.out.printf("Hello, %s!",enterText);
    }
}
