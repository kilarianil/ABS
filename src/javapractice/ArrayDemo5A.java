package javapractice;

public class ArrayDemo5A 
{

	public static void main(String[] args) 
	{

		int k[]= {10,20,30,40,50};
		ArrayDemo5A a1 =new ArrayDemo5A();
		a1.funA(k);

	}

	void funA(int[]arr)
	{

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
	

}
