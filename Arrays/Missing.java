import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int esum=n*(n+1)/2;
        int asum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            asum+=arr[i];
        }
        int missing=esum-asum;
        System.out.print(missing);
    }
    
}
