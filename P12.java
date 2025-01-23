package NumberPattern;
public class P12 {
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{ 
				if(i%2!=0)
				{
		         System.out.print("1 ");
				}
				else 
				{
				 System.out.print("*  ");
				}
			}
		   System.out.println(" ");
		}
    }
}

