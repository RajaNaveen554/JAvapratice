import java.util.*;
public class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int pcount = 0;
        int fcount = 0;
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            if (marks >= 35) {
                pcount++;
            } else {
                fcount++;
            }
        }
        System.out.println("Pass Count: " + pcount);
        System.out.println("Fail Count: " + fcount);
    }
}