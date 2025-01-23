package NumberPattern;

public class P8 {
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n+1;i++)
		{
			int k=1;
			for(int j=1;j<=n+1;j++)
			{ 
				
				if(j%2==0)
				{
		         System.out.print("* ");
				}
				else 
				{
				 System.out.print(k+" ");
				 k++;
				}
				
			}
		   System.out.println(" ");
		}
    }
}
