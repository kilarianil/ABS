package javapractice;

public class BudzDemo2
{ 

	public static void main(String[] args) 
	{
		int grosssalary=100000;
		BudzDemo2 bd1= new BudzDemo2();
		int netsalary = grosssalary-bd1.housecharges(); 
		System.out.println(netsalary);

	}
	int housecharges()
	{
		int rent=10000;
		int childfees=20000;
		int totalcharges=rent+childfees;
		System.out.println(totalcharges);
		return totalcharges;
	}

}
