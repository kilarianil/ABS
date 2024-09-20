package javapractice;

public class WraperClassDemo4 
{

	public static void main(String[] args)
	{
		String requitredAirMiles = "$5,000";
		int miles= Integer.parseInt(requitredAirMiles);
		int avilablAirMiles = 4000;
		if(avilablAirMiles>=miles) 
		{
			System.out.println("Book the ticket");
		}
		else
		{
			System.out.println("Air miles is in -sufficient");
		}


	}

}
