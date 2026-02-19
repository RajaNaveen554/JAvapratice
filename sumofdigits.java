import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number:");
        int n=sc.nextInt();
        int s=0;
        while(n>0)
        {
           int d=n%10;
           s+=d;
           n/=10;

        }
        System.out.println("The sum of Digits is:"+s);
    }

    
}
