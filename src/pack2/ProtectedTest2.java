package pack2;
import Pack1.ProtectedDemo1;
public class ProtectedTest2 extends ProtectedDemo1
{

	public static void main(String[] args) 
	{
		ProtectedTest2 p1= new ProtectedTest2();
		System.out.println(p1.a);
		p1.funA();
		
		ProtectedDemo1 p2= new ProtectedDemo1();
		System.out.println(p2.a); 
		p2.funA();
		
		
	}

}
