package pack2;
import Pack1.ProtectedDemo1;
public class ProtectedTest1 
{

	public static void main(String[] args) 
	{
		ProtectedDemo1 p1= new ProtectedDemo1();
		System.out.println(p1.a); // we can't use another properties in another package.
		p1.funA();
		
	}

}
