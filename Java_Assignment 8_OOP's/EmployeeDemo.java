import java.util.*;
class Employee 
{
	int empNo;
	double salary;
	double totalSalary;
	public Employee(double salary) 
	{
		this.salary = salary;
		empNo++;
		totalSalary=12*salary;
	}
	void display()
	{
		System.out.println("EMPLOYEE : "+empNo);
		System.out.println("EMPLOYEE TOTAL SALARY : "+totalSalary);
	}
	
}
class EmployeeDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		for(int i = 0 ; i < 5 ; i++)
		{
			
			e[i] = new Employee(sc.nextDouble());
			e[i].display();
		}
		sc.close();
	}
}