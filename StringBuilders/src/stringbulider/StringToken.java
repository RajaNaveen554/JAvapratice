package stringbulider;

import java.util.*;

public class StringToken {
	public static void main(String[] args)
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String: ");
		name=sc.nextLine();
		StringTokenizer st=new StringTokenizer(name);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println("I Complete 2 words and I started next words");
		System.out.println(st.nextToken());
	}

}
