import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = 180 / Math.PI * radians;
        System.out.printf("%.0f",degrees);
    }
}
