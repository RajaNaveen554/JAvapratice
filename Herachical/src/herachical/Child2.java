package herachical;

public class Child2 extends Parent{
	int code;
	String name;
	Child2(int pcode,String pname,int code,String name)
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
