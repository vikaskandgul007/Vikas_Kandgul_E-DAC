class Pattern1
{
public static void main(String[] args)
{
for (int i=1; i<=9; i++)
{
for(int j=9; j>=i; j--)
{
System.out.print(" ");
}
for (int k=1; k<=i; k++)
{
System.out.print(i+" ");
}
for(int m=0; m<=i; m++)
{
System.out.print(" ");
}
System.out.println();
}
} 
}