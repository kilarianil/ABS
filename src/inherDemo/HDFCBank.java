package inherDemo;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
		System.out.println("cons of HDFCBank");
	}
	public static void main(String[] args) 
	{
		HDFCBank h1= new HDFCBank();
		h1.CBillscore();
	}
	void CBillscore()
	{
		System.out.println("CBillscore of HDFCBank is 700");
	}
}
