import java.util.Scanner;

public class GreetingBynameVer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterText = scanner.nextLine();
        System.out.println("Hello, " + enterText + "!");
    }
}
