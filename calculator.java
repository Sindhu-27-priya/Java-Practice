
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter operator (or 'a' to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue; // Skips printing the old 'ans' value on error
                    }
                }
                if (op == '%') {
                    ans = n1 % n2;
                }

                // Move the print statement inside the loop so it prints after every valid operation
                System.out.println("Result: " + ans);

            } else if (op == 'a' || op == 'A') {
                System.out.println("Exiting calculator.");
                break;
            } else {
                System.out.println("Invalid operation!");
            }
            System.out.println(); // Adds a blank line for better readability
        }
    }
}
