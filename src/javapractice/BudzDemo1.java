package javapractice;

public class BudzDemo1
{
	public static void main(String[] args) 
	{
		
		int grosssalary=100000;
		int netsalary = grosssalary-totalcharges;
		System.out.println(netsalary);

	}
	void housecharges()
	{
		int rent=10000;
		int childfees=20000;
		int totalcharges=rent+childfees;
		System.out.println(totalcharges);
	}
}
