import java.util.*;
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        char attendance[] = new char[n];
        System.out.println("Enter attendance (P for Present, A for Absent):");
        for (int i = 0; i < n; i++) {
            attendance[i] = sc.next().charAt(0);
        }
        int presentDays = 0;

        for (int i = 0; i < n; i++) {
            if (attendance[i] == 'P') {
                presentDays++;
            }
        }
        double percentage = (presentDays * 100.0) / n;
        System.out.println("Present Days = " + presentDays);
        System.out.printf("Attendance Percentage = %.2f%%", percentage);
    }
}






