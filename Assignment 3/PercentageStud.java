import java.util.Scanner;
class PercentageStud
{
	public static void main(String... D)
	{
	float total, percentage;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of 5 subjects");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	total = a+b+c+d+e;
	percentage = (total/500)*100;
	System.out.println("Percentage = " +percentage+ " % ");
	}

}