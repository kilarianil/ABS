package javapractice;

public class BudzDemo3 
{
	public static void main(String[] args) 
	{
		int grosssalary=100000;
		BudzDemo3 bd1= new BudzDemo3();
		int netsalary = grosssalary-bd1.housecharges(); 
		System.out.println(netsalary);
		int taxcall=30*bd1.housecharges();
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
