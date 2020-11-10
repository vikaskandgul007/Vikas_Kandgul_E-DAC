public class Pattern4 
{
	public static void main(String args[])
	{
		int i,j,k;
		int space=20;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			space--;
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}