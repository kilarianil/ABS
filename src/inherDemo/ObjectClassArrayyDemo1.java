package inherDemo;

public class ObjectClassArrayyDemo1 
{

	public static void main(String[] args) 
	{
		Object orr[]= new Object[6];
		
		orr[0]= new Object();
		orr[1]= new RBIBank();
		orr[3]= new HDFCBank();
		orr[4]= "RBG technologies";
		orr[5]= 10;
		orr[6]= true;

	}

}
