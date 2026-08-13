import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size:");
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=-1;
        for(int i=0;i<s;i++)
        {
            if(a[i]>max) 

            {
                max=a[i];
            }
        }
         for(int i=0;i<s;i++)
        {
            if(a[i]>min && a[i]!=max)
            {
                min=a[i];
            }
    }
    System.out.print("Second largest number:"+min);
}
}          