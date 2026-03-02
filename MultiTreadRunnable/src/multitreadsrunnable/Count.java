package multitreadsrunnable;

public class Count implements Runnable {
	Thread myThread=new Thread();
	Count()
	{
		myThread.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Count:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
	}
}
