package inheritenceEg;
class GrandFather
{
	void m1()
	{
		System.out.println("ABC is Grand Father");
	}
}
class Father extends GrandFather
{
	void m2()
	{
		System.out.println("XYZ is Father");
	}
}

public class ChildMLI extends Father {
	void m3()
	{
		System.out.println("PQR is Child");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****MULTI LEVEL INHERITENCE****");
		ChildMLI x = new ChildMLI();
		x.m1();
		x.m2();
		x.m3();
		
		
		

	}

}
