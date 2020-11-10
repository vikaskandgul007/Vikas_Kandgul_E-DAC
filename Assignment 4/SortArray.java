import java.util.Scanner;
class SortArray
{
public static void main(String... Y)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array : ");
int size = sc.nextInt();
int temp=0;
int arr[] = new int[size];
System.out.println("Enter the elements of the array : ");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("\n Array elements are :");
for(int i=0;i<size;i++)
{
System.out.println(arr[i]+ " ");
}
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(arr[i]<arr[j])
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
System.out.println("\n After Descending order : ");
for(i=0;i<size;i++)
{
System.out.println(arr[i]+ " ");
}
sc.close();
}
}
}