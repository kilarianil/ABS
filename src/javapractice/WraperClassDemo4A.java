package javapractice;

public class WraperClassDemo4A 
{

	public static void main(String[] args) 
	{
		String requitredAirMiles = "$5,000";
		
		String s1= requitredAirMiles.replace("$","");
		
		String s2= s1.replace(",",""); 
		
		int miles= Integer.parseInt(s2);
		
		int avilablAirMiles = 4000+1000;
		
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
