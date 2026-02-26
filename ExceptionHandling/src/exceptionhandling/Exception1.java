package exceptionhandling;

import java.util.*;

public class Exception1 {
	public static void main(String[] args)
	{
		int a,b;
		float c;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a and b values:4");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("A="+ a + "  B="+ b + "  C="+c);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Input Exception Raised");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division by Zero Error");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		finally
		{
			System.out.println("Try...catch is completed");
		}
	}

}
