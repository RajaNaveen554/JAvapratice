//calculate cumulative values

import java.util.*;
class value
{
    public static void main(String args[])
    {
        int cumlative_amount=0,amount;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Amount");
        amount=in.nextInt();
        while(amount>0)
        {
            cumlative_amount+=amount;
            System.out.println("Enter Amount");
            amount=in.nextInt();
        }
        System.out.println("Cumilative Amount is " +cumlative_amount);
    }
}