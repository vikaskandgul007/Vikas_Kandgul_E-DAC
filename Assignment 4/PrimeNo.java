import java.util.Scanner;
class PrimeNo
{
	public static void main(String... B)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int n = sc.nextInt();
	boolean prime=false;
	for(int i=2;i<=n/2;i++)
	{
		if((n % i == 0))
		{
		prime = true;
		break;
		}	
	}
	if(prime==false)
		System.out.println(n + " is prime number");
	else
		System.out.println(n + " is not a prime number");
}
}



