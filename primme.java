//The given number prime or not
import java.util.*;
class primme
{
    public static void main(String args[])
    {
        int prime,count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number:");
        prime=in.nextInt();
        for(int i=2;i<prime;i++)
        {
            if(prime%i==0) 
            {
                count=1;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("It is Prime");
        }
        else
        {
            System.out.println("Its not Prime");
        }
    }
}