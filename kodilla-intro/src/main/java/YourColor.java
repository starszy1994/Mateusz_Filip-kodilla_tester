import java.util.Scanner;

public class YourColor {
    public static String getYourColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color - type first letter(B-blue, P-pink, W-white, R-red)");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "BLUE";
                case "P":
                    return "PINK";
                case "W":
                    return "WHITE";
                case "R":
                    return "RED";
                default:
                    System.out.println("Wrong first letter. Try Again!");
            }
        }
    }
}
