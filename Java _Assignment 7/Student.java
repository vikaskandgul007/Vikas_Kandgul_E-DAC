class Student
{
	int rollno;
	String name;
	int marks;
	void display()
	{
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{	
		
		Student stud1 = new Student();
		stud1.name="Vyankatesh";
		stud1.rollno=1;
		stud1.marks=86;
		stud1.display();
		Student stud2 = new Student();
		stud2.name = "Gaurav";
		stud2.rollno = 2;
		stud2.marks=92;
		stud2.display();
	}
}