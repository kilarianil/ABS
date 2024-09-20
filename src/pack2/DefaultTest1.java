package pack2;
import Pack1.DefaultDemo1;
public class DefaultTest1 
{

	public static void main(String[] args) 
	{
		DefaultDemo1 d1= new DefaultDemo1();
		System.out.println(d1.a);  // compile time error 
		d1.funA();                // compile time error 
	}

}
