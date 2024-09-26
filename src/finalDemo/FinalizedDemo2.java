package finalDemo;

public class FinalizedDemo2 
{

	public static void main(String[] args) 
	{
		FinalizedDemo2 f1 = new FinalizedDemo2();
		FinalizedDemo2 f2 = new FinalizedDemo2();
		FinalizedDemo2 f3 = new FinalizedDemo2();
		FinalizedDemo2 f4 = new FinalizedDemo2();
		FinalizedDemo2 f5 = new FinalizedDemo2();

		f1=f5;
		f2=f5;
		f3=f5;
		f4=f5;
		

		new FinalizedDemo2();
		new FinalizedDemo2();
		new FinalizedDemo2();
		System.gc();
		System.out.println("Done");
	}
	public void finalize() 
	{
		System.out.println("finalized of FinalizedDemo1");
		
	}

}
