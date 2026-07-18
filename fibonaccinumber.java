
import java.util.Scanner;

public class fibonaccinumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        //int c = 0;
        int n = sc.nextInt();
        /*for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }*/
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Fibonacci number:" + b);
    }
}
