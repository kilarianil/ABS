package interfaceDemo;

public class BankTest3 
{

	public static void main(String[] args) 
	{
		 Bank b2= new USBank();
	     b2.totalBalance();
	     b2.totalCustomers();
	     
	     b2=new UKBank();
	     b2.totalBalance();
	     b2.totalCustomers();
	     
	     b2=new CanadaBank();
	     b2.totalBalance();
	     b2.totalCustomers();
	}

}
