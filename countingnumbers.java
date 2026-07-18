
public class countingnumbers {

    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter a number to find the count: ");
        int find = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                count++;
            }
        }
        System.out.println(count);
         */
        int n = 45535;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
