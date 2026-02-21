package herachical;

public class Child1 extends Parent{
	int code;
	String name;
	Child1(int pcode,String pname,int code,String name)
	{
		super( pcode, pname);
		this.code=code;
		this.name=name;
		
		
	}
	public void showData()
	{
		System.out.println("Parent Code:" + pcode);
		System.out.println("Parent Name:" + pname);
		System.out.println("Code:" + this.code);
		System.out.println("Name:" + this.name);
	}

}
