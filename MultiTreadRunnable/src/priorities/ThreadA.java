package priorities;

public class ThreadA extends Thread{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n Thread A:"+i);
			}
			System.out.println("\n Thread A is Closed");	
		}
		catch(Exception e)
		{
			System.out.println("\n Thread A: "+e);
		}
	}
}
