import java.util.Scanner;
class OrderWise
{
public static void main(String... K) 
{	
	int i;
	int m,b=1,d=1;
      	Scanner sc= new Scanner(System.in);
       	m=sc.nextInt();
	int a[] = new int[m];
	for(i=0;i<m;i++)
	{
		a[i]=sc.nextInt();
	}
	i=0;
	while ((b == 1 || d == 1) && i < m - 1)
	{
		if(a[i] < a[i+1])
		d=0;
		else if (a[i] > a[i+1])
		b=0;
		i++;
	}
	if(b==1)
	{
		System.out.println("Array is sorted in ascending order");
	}
	else if(d==1)
	{
		System.out.println("Array is sorted in descending order");
	}
	else
	{
		System.out.println("Array is in random order");
	}       
	}
}