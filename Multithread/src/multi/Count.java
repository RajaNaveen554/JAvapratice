package multi;

public class Count extends Thread{
	Count()
	{
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Count:"+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
