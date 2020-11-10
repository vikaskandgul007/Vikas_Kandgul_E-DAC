import java.util.Scanner;
class Employee 
{
	
	int id;
	String name;
	String designation;

	Employee()
	{
	}
	
	Employee(int id, String name, String designation)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
	}


	void display()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Designation:"+this.designation);
	}

	Employee search(Employee[] emp, String person)
	{
		 for(int i=0;i<emp.length;i++)
		{
			String comp=emp[i].designation;
			if(comp.equals(person)){
			return emp[i];
		}

	}
	return null;

}
	
}
public class EmployeeDemo
{
 
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"Employee Id:");
			int id = sc.nextInt();
			System.out.println("Enter"+(i+1)+"Employee Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter"+(i+1)+"Employee Designation");
			//sc.nextLine();
			String designation = sc.next();
			emp[i]= new Employee(id,name,designation);
		}
		for(int i=0;i<emp.length;i++)
		{
 			System.out.println("Id:= "+emp[i].id);
 			System.out.println("Name := "+emp[i].name);
 			System.out.println("Designation := "+emp[i].designation);
		}

		
		System.out.println("Search for employee whose designation is manager");
		sc.nextLine();
		String person=sc.nextLine();
		Employee empDetails=emp1.search(emp,person);
		System.out.println("\n\n\n");
 		System.out.println("details ID := "+empDetails.id);
 		System.out.println("details NAME := "+empDetails.name);
 		System.out.println("details Designation := "+empDetails.designation);
	}  
}