import java.util.*;
public class DeciToBin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input the decimal number");
		int a=sc.nextInt();
		System.out.println(Integer.toBinaryString(a));
		sc.close();
	}
}