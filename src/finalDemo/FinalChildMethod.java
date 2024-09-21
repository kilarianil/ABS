package finalDemo;

public class FinalChildMethod extends FinalParentMethod
{

	public static void main(String[] args) 
	{
		FinalChildMethod f1= new FinalChildMethod();
		f1.ciBillscore();
	}
    public void ciBillscore()
    {
    	System.out.println("ciBillscore of FinalParentMethod is 700;");
    }
}
