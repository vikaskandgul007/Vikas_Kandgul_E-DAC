class Pattern5
{	
public static void main(String[] args) 	
{		
int i,j;	
int space=18;		
for(i=9;i<=1;i++)		
{			
for(j=9;j<=space;j++)			
{				
System.out.print(" ");			
}			
for(j=i;j<1;j--)			
{				
System.out.print((1+j)+" ");			
}			
space--;
space--;						
for(j=1;j<=i;j++)			
{				
System.out.print((1+j)+" ");			
}			
System.out.println();		
}	
}
}