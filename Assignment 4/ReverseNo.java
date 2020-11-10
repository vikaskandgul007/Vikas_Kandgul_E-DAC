import java.util.Scanner;
class ReverseNo
{
public static void main(String... K)
{
int reversedNum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a nuber to be reversed : ");
int n1 = sc.nextInt();
while(n1 !=0)
{
int n2 = n1 % 10;
reversedNum= reversedNum *10 + n2;
n1 = n1/10;
}
System.out.println("\n Reversed Number = " + reversedNum);
}
}