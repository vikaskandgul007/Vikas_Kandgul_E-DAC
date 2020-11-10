import java.util.*;
class Student 
{
	int rollno;
	String name;
	Scanner sc = new Scanner(System.in);
	void setData(int roll, String nm)
	{
		//System.out.println("Enter Rollno : ");
		rollno = roll;
		//System.out.println("Enter name : ");
		name=nm;
	}
	void showData()
	{
		System.out.println("Rollno is : "+ rollno);
		System.out.println("Name is : "+name);
	}
}
class StudentDemo

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s = new Student();
		System.out.println("enter ROLL NO : ");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter NAME : ");
		String nm=sc.nextLine();
		
		s.setData(roll, nm);
		s.showData();
		sc.close();
	}
}