package priorities;

public class ThreadC extends Thread{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n Thread C:"+i);
			}
			System.out.println("\n Thread C is Closed");	
		}
		catch(Exception e)
		{
			System.out.println("\n Thread A: "+e);
		}
	}
}
