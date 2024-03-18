import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        String order = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Tea");
        System.out.println("2. Cold Drink");
        System.out.println("3. Samosa");

        System.out.print("Enter choice (1-3): ");
        choice = sc.nextInt();

        // Logic
        switch (choice) {
            case 1:
                order = "Tea";
                break;
            case 2:
                order = "Cold Drink";
                break;
            case 3:
                order = "Samosa";
                break;
            default:
                order = "Not in menu";
                break;
        }

        // Output
        System.out.println("Your order: " + order);
    }
}
