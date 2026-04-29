import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalTimeMinutes = hours * 60 + minutes + 15;
        int newHours = totalTimeMinutes / 60;
        int newMinutes = totalTimeMinutes % 60;
        if (newHours >= 24){
            newHours-=24;
        }
        if (newMinutes >= 60){
            newMinutes-=60;
        }
        if (newMinutes < 10) {
            System.out.printf("%d:0%d",newHours,newMinutes);
        }else {
            System.out.printf("%d:%d",newHours,newMinutes);
        }
    }
}
