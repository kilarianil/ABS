package AbsDemo1;

public abstract class AbsDemo5 
{
	AbsDemo5()
	{
		System.out.println("cons of AbsDemo5");
	}
	public static void main(String[] args) 
	{
		AbsDemo5 abs= new AbsDemo5();
		abs.funC();
	}
	abstract void funA();
	abstract void funB(); 
	
	void funC()              
	{
		System.out.println("funC of AbsDemo5");
	}
}
