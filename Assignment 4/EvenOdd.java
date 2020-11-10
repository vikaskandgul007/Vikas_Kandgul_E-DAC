import java.util.Scanner;
class EvenOdd
{
public static void main(String...G)
{
int[] array = {1,2,3,4,5,6,7,8,9,10};
int evenSum = 0,oddSum=0;
for(int i=0;i<array.length;i++) 
{
if(array[i]%2==0)
evenSum = evenSum+array[i];
else
oddSum = oddSum+array[i];
}
System.out.println("Sum of even array elements is:"+evenSum);
System.out.println("Sum of odd array elments is:"+oddSum);
}
}



