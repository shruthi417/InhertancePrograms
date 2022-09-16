package inheritenceEg;
abstract class Example
{
	abstract void m1();
	void m2()
	{
		int x = 99;
		System.out.println("This is M2 code");
		System.out.println("x:" + x);
	}
}
public class AbstractEg extends Example {
	void m1()
	{
		System.out.println("This is M1 code");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEg x = new AbstractEg();
		x.m1();
		x.m2();
		
		

	}

}
