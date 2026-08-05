
import java.util.Scanner;

public class Nestedswitch {

    public static void main(String[] args) {
        // Using try-with-resources to ensure Scanner is properly closed
        try (Scanner sc = new Scanner(System.in)) {

            // Standard camelCase naming convention for variables
            int roomNo = sc.nextInt();
            String department = sc.next();

            // Modern switch expression syntax (Java 14+)
            switch (roomNo) {
                case 301 ->
                    System.out.println("A - Section Students");
                case 302 ->
                    System.out.println("B - Section Students");
                case 303 ->
                    System.out.println("C - Section Students");
                case 304 -> {
                    switch (department) {
                        case "CSE" ->
                            System.out.println("CSE Department");
                        case "ECE" ->
                            System.out.println("ECE Department");
                        case "EEE" ->
                            System.out.println("EEE Department");
                        default ->
                            System.out.println("H & S Department");
                    }
                }
                default ->
                    System.out.println("Ground");
            }
        }
    }
}
