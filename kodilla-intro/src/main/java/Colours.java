import java.util.Scanner;

public class Colours {

    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (R-red, G-green, B-blue)");
            String choice = scanner.nextLine().trim().toUpperCase();
            switch (choice) {
                case "R":
                    return "RED";
                case "G":
                    return "GREEN";
                case "B":
                    return "BLUE";
                default:
                    System.out.println("No colour were choose");
            }
        }
    }
}
