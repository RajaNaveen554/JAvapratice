import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Array Elements are:");
         for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        
        
    }
    
}
