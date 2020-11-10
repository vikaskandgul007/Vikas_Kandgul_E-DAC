import java.util.Scanner;
class LargestNo 
{
public static void main(String... j) 
{
        int seclarge = Integer.MIN_VALUE;
        int thilarge = Integer.MIN_VALUE;
        int flarge = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array values: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) 
	{
            arr[i] = sc.nextInt();
            if (flarge < arr[i]) 
	    {
                seclarge = flarge;
                flarge = arr[i];
            }
            if (seclarge < arr[i] && flarge != arr[i]) 
	    {
                thilarge = seclarge;
                seclarge = arr[i];
            if (thilarge < arr[i] && seclarge != arr[i])
		thilarge = arr[i];
            }

        }
System.out.println("Second Largest number is: " + seclarge + "\n Third largest number is=====" + thilarge);
    }
}