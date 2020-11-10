import java.util.*;
class ReplaceOccur
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            int x=arr.length, count;
            
            for(int i=0;i<x-1;i++)
            {
                count=0;
                for(int j=0;j<x;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        if(count>1)
                        {
                            arr[j]=' ';
                            break;
                        }
                    }
                }
            }
            for(int i=0;i<x;i++)
            {
                if(arr[i]!=' ')
                    System.out.print(arr[i]);
            }
            System.out.println();
        }
}