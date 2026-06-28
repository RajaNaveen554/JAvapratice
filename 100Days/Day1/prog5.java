import java.util.Scanner;
public class prog5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        double avg=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            avg=sum/n;
        }
        int max=0;
       
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Sum of Score:"+sum);
        System.out.println("Average score:"+avg);
        System.out.println("Highest score:"+max);
    }
    
}
