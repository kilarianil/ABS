package javapractice;

public class ConsDemo10 
{
	int a=5; 
	int b=10;
	ConsDemo10 (int i,int j)
	{
		a=i;
		b=j;
	}
	public static void main(String[] args) 
	{
		ConsDemo10 c1=new ConsDemo10(20,30);
		System.out.println(c1.a);
		System.out.println(c1.b);

	}

}
