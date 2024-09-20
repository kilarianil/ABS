package javapractice;

public class ArrayDemo4 
{

	public static void main(String[] args)
	{
		Ramesh1 r=new Ramesh1();
		Ramesh1 arr[]= new Ramesh1[5];
		arr[0]= new Ramesh1();
		arr[1]= new Ramesh1();
		arr[2]= r;
		arr[3]= new Ramesh1();
		arr[4]= null;

		System.out.println(r);
		System.out.println(arr[2]);
	}

}
	