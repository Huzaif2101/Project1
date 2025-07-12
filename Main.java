import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase? (true/false): ");
        boolean upper = scanner.nextBoolean();

        System.out.print("Include lowercase? (true/false): ");
        boolean lower = scanner.nextBoolean();

        System.out.print("Include numbers? (true/false): ");
        boolean numbers = scanner.nextBoolean();

        System.out.print("Include symbols? (true/false): ");
        boolean symbols = scanner.nextBoolean();

        try {
            Password password = generator.generate(length, upper, lower, numbers, symbols);
            System.out.println("Generated password: " + password);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
