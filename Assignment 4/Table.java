import java.util.Scanner;
class Table
{
public static void main(String... J)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number : ");
int n = sc.nextInt();
for(int i=1; i<=10; i++)
{
System.out.println(n+ " * "+i+ " = "+n*i);
}
}
} 