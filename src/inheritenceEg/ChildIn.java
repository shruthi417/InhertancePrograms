package inheritenceEg;
//SINGLE LEVEL INHERITENCE
class Parent
{
	void m1()
	{
		System.out.println("ABC is Father");
	}
}
public class ChildIn extends Parent{
	void m2()
	{
		
		System.out.println("abc is Child");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****Single Level Inheritence****");
		ChildIn x = new ChildIn();
		x.m1();
		x.m2();
		

	}

}
