import java.util.Scanner;
import java.util.Arrays;
class TwoSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();
        int target=9;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
               
                if(i!=j && arr[i]+arr[j]==target)
                {
                    System.out.print(i + " " + j);
                    found=true;
                    break;
                }
            }
            if (found) {
                break;
                
            }
        }
        if(!found)
        {
            System.out.print("Target is not found");
        }
    }
}