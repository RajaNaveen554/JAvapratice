import java.util.Scanner;

public class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < n) {
            int bill;
            if (a[i] <= 100) {
                bill = a[i] * 5;
            } else {
                bill = (100 * 5) + ((a[i] - 100) * 8);
            }
            System.out.println("Consumer " + (i + 1) + " Bill = " + bill);
            i++;
        }
    }

}
