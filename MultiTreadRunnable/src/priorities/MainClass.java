package priorities;

public class MainClass {
	public static void main(String[] args)
	{
		Thread threada=new ThreadA();
		Thread threadb=new ThreadB();
		Thread threadc=new ThreadC();
		threada.setPriority(Thread.MIN_PRIORITY);
		threadb.setPriority(Thread.MAX_PRIORITY);
		threadc.setPriority(Thread.NORM_PRIORITY);
		System.out.println(threada.getPriority());
		System.out.println(threadb.getPriority());
		System.out.println(threadc.getPriority());
		threada.start();
		threadb.start();
		threadc.start();
	}

}
