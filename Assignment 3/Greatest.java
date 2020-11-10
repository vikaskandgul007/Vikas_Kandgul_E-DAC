class Greatest
{
	public static void main(String... A)
	{
	int x=35,y=24,z=54,a;
	/*if (x > y && x > z)
	{
	System.out.println(x+ " is greater");
	}
	else if (y > x && y > z)
	System.out.println(y+ " is greater");
	else
	System.out.println(z+ " is greater");*/

     /*	System.out.println(x > y ? "Greater no is" +x:"Greatest no is " +y);*/
	int b = z> (x >y ? x : y) ? z : ((x >y) ? x : y);
	System.out.println("greatest no:" +b);
	}
}