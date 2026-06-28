import java.util.*;

public class prog6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of ratings: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        System.out.println("Enter the ratings:");

        for (int i = 0; i < n; i++) {
            int rating = sc.nextInt();

            if (rating == 0) {
                continue;
            }

            sum += rating;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average Rating = %.2f", average);
        } else {
            System.out.println("No valid ratings.");
        }
    }
}