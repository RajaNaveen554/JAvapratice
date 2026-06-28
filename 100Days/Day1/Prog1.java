import java.util.*;
public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int s = sc.nextInt();
        int a[] = new int[s];
        int sum = 0;
        double dis = 0;
        double total;
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < s; i++) {
            if (a[i] > 1000) {
                dis+=a[i] * 0.10;
            }
        }
        total = sum - dis;
        System.out.println("Total Amount = " + sum);
        System.out.println("Discount = " + dis);
        System.out.println("Final Amount = " + total);
    }
}
