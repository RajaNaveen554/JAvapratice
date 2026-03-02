package multi;
/*
What is multithread ?
multithread is a separate program.
A Single processor can do the multple programs simultaneously.
it executes concurrently or parallely depends upon the system speed.
In Operating system we are calling Multitasking
In Programming Languages we are calling Multithrading
*/
public class prog1 extends Thread {
	public void run(){
		try{
			System.out.println("\n My first Thread is started");
			for(int i=0;i<=5;i++)
			{
				System.out.println("\ni=" + i);
				if(i==1 || i==3)
				{
					sleep(3000);
				}
			}
			System.out.println("\nThread is Completed");
		}
			catch(Exception e)
			{
				System.out.print(e);
			}
	}
		public static void main(String[] args)
		{
			prog1 p=new prog1();
			p.start();
			System.out.println("The above Thread is started");
}
		
}
