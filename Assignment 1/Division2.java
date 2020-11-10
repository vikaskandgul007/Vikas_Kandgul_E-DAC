import java.util.Scanner;
class Division2
{
	public static void main(String[] args)
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter first number:" );
	float a = s1.nextFloat();
	System.out.println("Enter second number:" );
	float b = s1.nextFloat();
	float div = a/b;
	System.out.println();
	System.out.println("The division is:" +div);
	}
}