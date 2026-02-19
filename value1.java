//calculate cumulative values
//using do while

import java.util.*;
class value1
{
    public static void main(String args[])
    {
        int cumlative_amount=0,amount;
        Scanner in=new Scanner(System.in);
        
       do
        {
            System.out.println("Enter Amount");
            amount=in.nextInt();
            if(amount>0) cumlative_amount+=amount;
        }while(amount>0);
        System.out.println("Cumilative Amount is " +cumlative_amount);
    }
}