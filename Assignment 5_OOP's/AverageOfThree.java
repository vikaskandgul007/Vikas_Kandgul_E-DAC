class AverageOfThree
{
	public static void main(String...U) 
	{
        	int avg=0;
		int a[] = {5,14,35,89,140,188};
                int n = a.length;
                int c[] = new int[n];
		int sum=0;
		for (int i = 0; i <=n; i++)
        	{
            		sum = a[i] + a[i + 1] + a[i + 2]; 
			avg = sum/3;
            		System.out.println(avg + ""); 
        	}
	}
}
