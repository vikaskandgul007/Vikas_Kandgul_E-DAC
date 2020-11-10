import java.util.*;
class NonReapitive
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            int x=arr.length,count=0;
            char y=' ';
            
            for(int i=1;i<x-1;i++)
            {
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                {
                   y=arr[i];
                   count++;
                   break;
                }
            }
                if(count==1)
                   System.out.println(y);
                else
                   System.out.println("Not found");
        }
}