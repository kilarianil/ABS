package javapractice;

public class BudzDemo4 
{
	public static void main(String[] args) 
	{
		int grosssalary=100000;
		BudzDemo3 bd1= new BudzDemo3();
		int charges=bd1.housecharges();
		int netsalary = grosssalary-charges;
		System.out.println(netsalary);
		int taxcall=30*charges;
		System.out.println(taxcall);
	}
	int housecharges()
	{
		System.out.println("house charges isinvoking");
		int rent=10000;
		int childfees=20000;
		int totalcharges=rent+childfees;
		System.out.println(totalcharges);
		return totalcharges;
	}
}
