import java.util.Scanner;
class Bintodeci
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter binary number:");
String binaryStr = sc.nextLine();
System.out.println();
System.out.println("Decimal value is:" +Integer.parseInt(binaryStr,2));
}
}