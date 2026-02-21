package abstracts;

public abstract class Bike {
	public static final int millage=65;
	public static String brand="RAja";
	public abstract void getBenifit();
	public static void getMillage()
	{
		System.out.println("Millage:"+millage);
		System.out.println("Brand:"+brand);
	}

}
