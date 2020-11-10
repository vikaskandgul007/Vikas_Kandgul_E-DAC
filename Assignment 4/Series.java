import java.util.Scanner;
class Series
{
public static void main(String ...A)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n : ");
int n = sc.nextInt();
int sum = (n * (n + 1) * (2 * n + 1)) / 6;
System.out.print("Sum of the series = " + sum);
}
}
