import java.util.*;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sales entries: ");
        int n = sc.nextInt();
        int totalSales = 0;
        System.out.println("Enter the sales values:");
        for (int i = 0; i < n; i++) {
            int sale = sc.nextInt();
            if (sale == -1) {
                continue;   // Holiday, skip this entry
            }
            if (sale == 0) {
                break;      // System crash, stop processing
            }
            totalSales += sale;
        }
        System.out.println("Total Sales = " + totalSales);
    }
}