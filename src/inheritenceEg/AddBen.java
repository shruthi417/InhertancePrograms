package inheritenceEg;
class login
{
	void VerifyLogin()
	{
		System.out.println("This is login");
	}
}

public class AddBen extends login{
	void VerifyAddBen()
	{
		System.out.println("This is Add Benificiary");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBen x = new AddBen();
		x.VerifyLogin();
		x.VerifyAddBen();
		

	}

}
