class ReverseArray
{
public static void main(String ...A)
{
int arr[] = {1,2,3,4,5};
System.out.println("Original array :");
for(int i=0; i<arr.length;i++)
{
System.out.println(arr[i]+ " ");
}
System.out.println("Array in reverse order :");
for( int i= arr.length-1; i>=0; i--)
{
System.out.println(arr[i]+ " ");
}
}
}