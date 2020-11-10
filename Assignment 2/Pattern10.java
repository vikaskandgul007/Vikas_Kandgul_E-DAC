class Pattern10
{
public static void main(String args[])
{
	for(int i=1;i<=6;i++)
	{
		if (i<2 || i>4)
		{
			for(int j=6;j>=i;j--)
			System.out.print("*");
		}
		else
		{
				System.out.print("*");
				for(int k=4;k>=i;k--)
				{
					System.out.print(" ");
				}
				System.out.print("*");
		}
			
		//for(int j=6;j>=i;j--)
		{
			//if(i<2 || i>4)
			{
			//	System.out.print("*");
			}
			//else
			{
				//System.out.print("*");
				//for(int k=3;k<=1;k--)
				{
				//	System.out.print(" ");
				}
			
			//System.out.print("*");
			}	
			//System.out.println();
		}	
		System.out.println();
	}
	
}
}