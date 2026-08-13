import java.util.*;

public class Single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c += 1;
                }
            }
            if (c == 1) {
                System.out.println("Single number found:" + arr[i]);
                break;
            }
            else{
                System.out.print("Single number not found");
            }
        }
    }

}
