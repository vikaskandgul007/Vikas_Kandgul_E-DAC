class Concatenate
{
    public static void main(String... P)
{
        int i=0,j=0,k=0;
		int a[] = {23,60,94,3,102};
		int b[] = {42,16,74};
		int n1 = a.length;
		int n2 = b.length;
		int c[]= new int[n1+n2];
		while(i<n1 && j<n2)
		{	
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		while(i<n1)
		{
			c[k++]=a[i++];
		}
		while(j<n2)
		{
			c[k++]=b[j++];
		}
		System.out.println("After Merging array is:");
		for(i=0;i<n1+n2;i++)
		{
			System.out.print(c[i]+ " ");
		}
        
    }
    
}