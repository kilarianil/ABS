package javapractice;

public class ArrayDemo6 
{

	public static void main(String[] args)
	{
		ArrayDemo6 a1= new ArrayDemo6();
		int arr[]=a1.funA();
		System.out.println(arr[2]);
		System.out.println(a1.funA()[2]);
	} 
	int[] funA()
	{
		int k[]={10,20,30,40,50};
		return  k;
	}
}
