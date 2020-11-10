class Expression
{
	public static void main(String args[])
	{
	/* double x=3, y=2, p=2;
	y= (Math.pow(x,p)+3*x-7);
	System.out.println(" "+y);
	
	y= x++ + ++x;
	System.out.println(" "+y);
	
	z=x++ - --y- --x + x++;
	System.out.println(" "+z);
*/
	boolean x=true, y=false, z;
	z=x && y ||!(x||y);
	System.out.println(" "+z);
	}
}