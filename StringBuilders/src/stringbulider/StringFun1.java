package stringbulider;
import java.util.*;
public class StringFun1 {
	public static void main(String[] args) {
		String name;
		Scanner in=new Scanner(System.in);
		int p;
		name="Hellow How Are You";
		System.out.println("Enter Which position character you want print:");
		p=in.nextInt();
		System.out.println(name.charAt(p));
		System.out.println(name.compareTo("hellow How Are You"));
		System.out.println(name.compareToIgnoreCase("HELLOW HOW ARE YOU"));
		System.out.println(name.concat(" Raja Naveen"));
		System.out.println("Tirumalasetti , ".concat(name));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
	}
}
