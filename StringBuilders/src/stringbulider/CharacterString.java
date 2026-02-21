package stringbulider;

public class CharacterString {
	public static void main(String[] args)
	{
		  String name="RajaNaveen",name1="   RajaNaveen   ";
		    System.out.println(name.length());
		    System.out.println(name.charAt(0));
		    System.out.println(name.indexOf('a'));
		    System.out.println(name.substring(3));
		    System.out.println(name.substring(3,6));
		    System.out.println(name.toLowerCase());
		    System.out.println(name.toUpperCase());
		    System.out.println("Rama is a good boy".replace("good","bad"));
		    System.out.println(name.equals("RajaNaveen"));
		    System.out.println(name.equalsIgnoreCase("RajaNaveen"));
		    System.out.println(name.concat(" Garu"));
		    System.out.println(name1.trim());
		    System.out.println(name.endsWith("en"));
		    System.out.println(name.startsWith("Ra"));

		
	}

}
