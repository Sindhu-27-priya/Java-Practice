
import java.util.Scanner;

public class switchcases {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango":
                System.out.println("Mango is a sweet fruit");
                break;
            case "Apple":
                System.out.println("Apple is red in colour");
                break;
            case "Orange":
                System.out.println("Orange match the colour name");
                break;
            case "Banana":
                System.out.println("Banana is rich in magnesium");
                break;
            default:
                System.out.println("Incorrect String");
        }
    }
}
