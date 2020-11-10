import java.util.*;
class GrossSalary
{
	public static void main(String... A)
	{
	double hra, da, gs;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Employees Salary :");
	double bs = in.nextDouble();
	if (bs < 10000)
	{
	hra = (bs * 0.10);
	System.out.println("The HRA is :" +hra);
	da = (bs * 0.90);
	System.out.println("The DA is :" +da);
	}
	else
	{
	hra = 2000;
	da = (bs * 0.98);
	System.out.println("The DA is :" +da);
	}
	gs = bs + hra + da;
	System.out.println("The Gross Salary is :" +gs);
	}
}