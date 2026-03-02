package multitreadsrunnable;

public class RunnableClass {
	public static void main(String[] args)
	{
		Count cnt=new Count();
		try
		{
			while(cnt.myThread.isAlive())
			{
				System.out.println("Thread is Running");
				Thread.sleep(3000);
			}
			System.out.println("Thread is Dead");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}
