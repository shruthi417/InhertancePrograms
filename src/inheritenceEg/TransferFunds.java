package inheritenceEg;
class Login1
{
	void login()
	{
		System.out.println("This is Login");
	}
}
class AddBen1 extends Login1
{
	void AddBen()
	{
		System.out.println("This is Add Benificiary");
	}
}

public class TransferFunds extends AddBen1{
	void TransferFunds()
	{
		System.out.println("This is Transfer Funds");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferFunds x = new TransferFunds();
		x.login();
		x.AddBen();
		x.TransferFunds();
		
	}

}
