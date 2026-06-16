import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
            int max=a[0];
        for(int i=1;i<s;i++)
            if(a[i]>max)
            {
                max=a[i];
            }
            
        System.out.print("Largest element is: " + max);
        }
        

    }
  
