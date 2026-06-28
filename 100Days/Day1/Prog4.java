import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Intial Balance:");
        int b=sc.nextInt();
        System.out.print("Enter the Array size:");
        int s=sc.nextInt();
        int a[]=new int[s];
         for(int i=0;i<s;i++)
         {
            a[i]=sc.nextInt();
         }

        for(int i=0;i<s;i++)
        {

            b+=a[i];
            if(b<0)
            {
                System.out.println("Insufficient Balance");
                break;
            }
        }
      
        System.out.println("Total balance:"+b);

    }
    
}
