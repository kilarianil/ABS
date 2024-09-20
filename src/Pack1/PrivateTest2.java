package Pack1;

public class PrivateTest2 
{

	public static void main(String[] args) 
	{
		PrivateDemo2 p1= new PrivateDemo2();//compile time error  this is private constructor  
		
		p1.funB();
	}

}
