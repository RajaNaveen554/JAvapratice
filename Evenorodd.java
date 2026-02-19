import java.util.Scanner;
public class Evenorodd{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n=sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("The value " + n + " is Odd");
        }
        else{
            System.out.println("The value "+ n +" is Even");
        }
    }
}