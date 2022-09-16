package inheritenceEg;
interface interfaceA
{
	void m1();
}
interface interfaceB
{
	void m2();
}
interface interfaceC
{
	void m3();
}

public class MultipleInheritanceEg implements interfaceA, interfaceB, interfaceC{
	public void m1()
	{
		System.out.println("This is M1 code, from interfaceA");
	}
	public void m2()
	{
		System.out.println("This is M2 code, from interfaceB");
	}
	public void m3()
	{
		System.out.println("This is M3 code, from interfaceC");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceEg x = new MultipleInheritanceEg();
		x.m1();
		x.m2();
		x.m3();

	}

}
