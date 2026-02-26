package exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter the Array size:");
			int n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter " + n+ " Elements:");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("The Elements are:");
			for (int i = 0; i < n; i++) {
				System.out.println(a[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println(aioe);
		} catch (InputMismatchException ime) {
			System.out.println(ime);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
