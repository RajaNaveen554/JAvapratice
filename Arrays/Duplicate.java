import java.util.Scanner;
import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<s;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate Found:"+arr[i]);
                    found=true;
                    break;
                }
            }
        }
        if(!found)
        {
            System.out.println("Duplicate not found ");
        }

    }
    
}
