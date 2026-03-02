package multi;

public class CountLive extends Thread{
	public static void main(String[] args)
	{
		Count cnt=new Count();
		try
		{
			while(cnt.isAlive())
			{
				System.out.println("Thread is Live");
				Thread.sleep(3000);
			}
			System.out.println("Thread is Close");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
