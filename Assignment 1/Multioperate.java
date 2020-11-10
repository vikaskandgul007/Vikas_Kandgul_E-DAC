import java.util.Scanner;
class Multioperate
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers:");        
int n1 = sc.nextInt();
int n2 = sc.nextInt();

System.out.println("Enter an operator (+,-,*,/,%): ");
char operator = sc.next().charAt(0);
int n3;
switch (operator)
{
	case '+':
	n3 = n1+n2;
	System.out.println("Addition =" +n3);
	break;

case '-':
n3 = n1-n2;
System.out.println("Subtraction =" +n3);
break;

case '*':
n3 = n1*n2;
System.out.println("Multiplication = " +n3);
break;

case '/':
n3 = n1/n2;
System.out.println("Division = " +n3);
break;

case '%':
n3 = n1%n2;
System.out.println("Remainder = " +n3);
break;
default:
System.out.println("You entered a wrong choice:");
}
}
}