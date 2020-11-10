import java.util.Scanner;
class PrimeTwo
{
public static void main(String[] args)
{
int n,m,found;
Scanner sc = new Scanner(System.in);		
System.out.println("Enter the lower value: ");
n=sc.nextInt();
System.out.println("Enter the upper value: ");
m=sc.nextInt();
System.out.println("Prime numbers between "+n+" "+"&"+" "+m+" "+"are: ");
for(int i=n;i<=m;i++)
{
if(i==1 || i==0)
{
continue;				
}
found=1;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
found=0;
break;
}
}	
if(found==1)
{
System.out.println(i);
}
}
}
}