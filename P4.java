package NumberPattern;

public class P4 {
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for(int i=1;i<=n+1;i++)
		{
			for(int j=1;j<=n+1;j++)
			{ 
				System.out.print(k+" ");
				if(k<8)
				{
		           k++;
				}
				else
				{
				   k=1;
				}
			  
	        }
		   System.out.println(" ");
		}
   }
}
