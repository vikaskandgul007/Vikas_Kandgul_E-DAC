import java.util.Scanner;
class ReadDays
{
	public static void main(String... A)
	{
	float m,y;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the days : ");
	float d = sc.nextFloat();
	y = d/365;
	System.out.println("Total years is/are : " +y);
	m = d/30;
	System.out.println("Total months is/are : " +m);
	}
}	