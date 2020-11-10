import java.util.*;
class MathOperation 
{
	static int a,b;
	
	static int add(int a, int b)
	{
		return a+b;
	}
	static int subtract(int a, int b)
	{
		return a-b;
	}
	static int multiply(int a, int b)
	{
		return a*b;
	}
	static double power(int a, int b)
	{
		return Math.pow(a, b);
	}
}
class MathDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE : ");
		int a=sc.nextInt();
		System.out.println("ENTER B VALUE : ");
		int b=sc.nextInt();
		int res1 = MathOperation.add(a, b);
		System.out.println(res1);
		int res2 = MathOperation.subtract(a, b);
		System.out.println(res2);
		int res3 = MathOperation.multiply(a, b);
		System.out.println(res3);
		double res4 = MathOperation.power(a, b);
		System.out.println(res4);
		sc.close();
	}
}
