package Oops;
import java.util.*;
public class Oops1 {
	public static void main(String[] args)
	{
		/*
		 * int code; String name; Scanner sc=new Scanner(System.in);g
		 * System.out.print("Enter the Code:"); code=sc.nextInt();
		 * System.out.print("Enter the Name:"); name=sc.next(); Student student=new
		 * Student(); student.setData(code, name); student.showData();
		 */
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		System.out.print("Enter the Code:");
		student.code=sc.nextInt();
		System.out.print("Enter the Name:");
		student.name=sc.next();
		System.out.println("Code:"+student.code);
		System.out.println("Name:"+student.name);
	}
}
