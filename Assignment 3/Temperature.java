import java.util.Scanner;
class Temperature
{
public static void main(String args[])
{
System.out.println("Enter the temperature in Fahrenheit :");
Scanner sc = new Scanner(System.in);
float f = sc.nextFloat();
float C=(5*(f-32)/9);
System.out.println("The Celcius temperature is :" +C);
}
}