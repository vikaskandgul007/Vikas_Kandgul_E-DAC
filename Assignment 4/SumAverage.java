import java.util.Scanner;
class SumAverage
{
	public static void main(String[] args)
	{
    		int[] array = {1,2,3,4,5,6,7,8,9,10};
      		int sum = 0,avg=0;
           	for( int num : array) 
		{
          		sum = sum+num;
			avg =sum/num;
      		}
      		System.out.println("Sum of array elements is:"+sum);
      		System.out.println("Average of array elments is:"+avg);
	}
}