import java.util.Scanner;
class Series
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	System.out.println("Please enter limit up to you want series");
        	int num =input.nextInt();
        	int arr[]=new int[num];
		int a=1;
        	for(int i=0;i<num;i++)
        	{
            		if(a%2==0)
            		{
                		arr[i]=a*a;
				a++;
           		}
			else 
			{
                		arr[i] = a*a*a;
				a++;
            		}

        	}

        	for(int i:arr)
        	{
            		System.out.print(i+" ");
        	}
                
	}
}