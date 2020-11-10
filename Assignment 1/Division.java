import java.util.Scanner;
class Division
{
	public static void main(String[] args)
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter first number:" );
	double a = s1.nextDouble();
	System.out.println("Enter second number:" );
	double b = s1. nextDouble();
	double div = a/b;
	System.out.println();
	System.out.println("The division is:" +div);
	}
}