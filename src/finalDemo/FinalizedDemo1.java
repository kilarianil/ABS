package finalDemo;

public class FinalizedDemo1 
{

	public static void main(String[] args) 
	{
		FinalizedDemo1 f1 = new FinalizedDemo1();
		FinalizedDemo1 f2 = new FinalizedDemo1();
		FinalizedDemo1 f3 = new FinalizedDemo1();
		FinalizedDemo1 f4 = new FinalizedDemo1();
		FinalizedDemo1 f5 = new FinalizedDemo1();
		
		f1=f5;
		f2=f5;
		f3=f5;
		f4=f5;
		f5=f5;
		
		new FinalizedDemo1();
		new FinalizedDemo1();
		new FinalizedDemo1();
		System.gc();	
	System.out.println("Done");
	}



}
