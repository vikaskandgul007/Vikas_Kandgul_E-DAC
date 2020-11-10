import java.util.Scanner;
class SearchElement
{
	public static void main(String[] args)
	{
    		
		int num,searchNum,found=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		num= sc.nextInt();
		int arr[] = new int [num];
		System.out.println("Enter array elements:");
		for( i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		searchNum=sc.nextInt();
		for(i=0;i<num;i++)
		{
			if(arr[i]==searchNum)
			{
				found=1;
				break;
			}
			else
			{
				found=0;
			}
			
		}
		if(found==1)
			{
				System.out.println("Element found at pos:"+(i+1));
			}
			else
			{
				System.out.println("Element not found");
			}
		
		
	}
}