import java.util.Scanner;
abstract class Processor 
{
	double data;
	
	void showData()
	{
		System.out.println(data);
	}
	abstract void process();
}
class Factorial extends Processor
{
	Scanner sc = new Scanner(System.in);
	void process()
	{
		int fact=1;
		System.out.println("ENTER NUMBER FOR FACTORIAL : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact = fact *i; 
		}
		data=fact;
		System.out.println(data);
		
	}
}
class Circle extends Processor 
{
	Scanner sc = new Scanner(System.in);
	void process()
	{
		System.out.println("ENTER RADIUS : ");
		int radius = sc.nextInt();
		double area = 3.14*radius*radius;
		//data=area;
		System.out.println("AREA IS : "+area);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE : ");
		System.out.println("1 for factorial, 2 for circle area");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				Factorial f = new Factorial();
				f.process();
			}
			break;
			case 2:
			{
				Circle c = new Circle();
				c.process();
			}
			break;
			default : 
				System.out.println("wrong choice");
		}
		sc.close();
	}
}