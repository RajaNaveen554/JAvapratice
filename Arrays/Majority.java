import java.util.*;
public class Majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int l=n/2;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c+=1;
                }
            }
            if (c>l) {
                System.out.println("Majority number:"+arr[i]);
                break;
                
            }
        }
       
    }
    
}
