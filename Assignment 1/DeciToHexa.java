import java.util.*;
public class DeciToHexa 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input the decimal number");
		int a=sc.nextInt();
		System.out.println(Integer.toHexString(a));
		sc.close();
	}
}