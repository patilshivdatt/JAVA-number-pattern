package NumberPattern;

public class P11 {
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{ 
				if(i+j>=n+1)
				{
		         System.out.print(k+" ");
		         k++;
				}
				else 
				{
				 System.out.print(" ");
				}
			}
		   System.out.println(" ");
		}
    }
}

