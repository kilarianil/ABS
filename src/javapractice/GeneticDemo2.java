package javapractice;

public class GeneticDemo2<T> {

	public static void main(String[] args) 
	{
		GeneticDemo2<String> g1= new GeneticDemo2<String>();
		g1.funA("RBG technologies");
		
		GeneticDemo2<Integer> g2= new GeneticDemo2<Integer>();
		g2.funA(10);
		
		GeneticDemo2<Boolean> g3= new GeneticDemo2<Boolean>();
		g3.funA(true);
		
		GeneticDemo2<A> g4= new GeneticDemo2<A>();
		g4.funA(new A());


	}
	void funA(T k1)
	{
		System.out.println(k1);
	}
}
