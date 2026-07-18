
import java.util.Scanner;

public class largestnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        /* int largest = num1;
        if(num2 > largest){
            largest = num2;
        }
        if(num3 > largest){
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
         */
        int max = Math.max(c, Math.max(a, b));
    }
}
