package inheritenceEg;
interface interface1
{
	void m1();
	void m2();
	
	
}

public class InterfaceEg implements interface1{
	public void m1()
	{
		System.out.println("This is M1 code");
	}
	public void m2()
	{
		System.out.println("This is M2 code");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEg x = new InterfaceEg();
		x.m1();
		x.m2();
		

	}

}
