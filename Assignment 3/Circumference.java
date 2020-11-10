import java.util.Scanner;
class Circumference
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius:");
	double rad = sc.nextDouble();
	System.out.println("Circumference = "+(2 * Math.PI * rad));
	System.out.println("Area = "+(Math.PI * rad *rad)); 
	}
}