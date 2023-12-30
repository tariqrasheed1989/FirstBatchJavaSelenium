package javaCollection;

public class Super 
{
	int x=5;
	
	public void test()
	{
		int x=9;
		System.out.println(this.x);
	//	System.out.println(x);		

	}
	
	public static void main(String[] args) 
	{
		Super ob=new Super();
		ob.test();								
	}
}
