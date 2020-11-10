import java.util.Scanner;
class Marriage
{
	public static void main(String... D)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender : M/F");
		char gender = sc.next().charAt(0);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if(gender== 'M')
		{
			if(age>=21 && age<=40)
			System.out.println("He is eligible for marriage");
			else
			System.out.println("He is not eligible for marriage");
			}	
		else if(gender == 'F')
		{
			if(age>=18 && age<=30)
			System.out.println("She is eligible for marriage");
			else
			System.out.println("She is not eligible for marriage");
			}
		else
		{
			System.out.println("Invalid Data Entered");
		}
	}
}
