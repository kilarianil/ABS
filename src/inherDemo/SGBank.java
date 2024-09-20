package inherDemo;

public class SGBank extends RBIBank
{

	public static void main(String[] args) 
	{
		SGBank sg= new SGBank();
		sg.goldloan();
		sg.CBillscore();
	}
	
	
	void goldloan()
	{
		System.out.println("goldloan of SGBank");
		
	}

}
