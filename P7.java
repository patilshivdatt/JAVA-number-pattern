package NumberPattern;

public class P7 {
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n+1;i++)
		{
			for(int j=1;j<=n+1;j++)
			{ 
				
				if(j%2==0)
				{
		         System.out.print("* ");
				}
				else if(j==n-1)
				{
				 System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
			  
	        }
		   System.out.println(" ");
		}
   }
}
