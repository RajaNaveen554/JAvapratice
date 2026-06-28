import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<s;i++)
        {
            if(a[i]==-1)
            {
                continue;
            }
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
