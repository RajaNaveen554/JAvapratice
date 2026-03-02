package priorities;

public class ThreadB extends Thread{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n Thread B:"+i);
			}
			System.out.println("\n Thread B is Closed");	
		}
		catch(Exception e)
		{
			System.out.println("\n Thread A: "+e);
		}
	}
}
