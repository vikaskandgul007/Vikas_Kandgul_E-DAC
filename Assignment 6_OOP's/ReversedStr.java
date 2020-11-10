import java.util.*;
class ReversedStr
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String: ");
            String s=sc.nextLine();
            
            String sl=s.toLowerCase();
            char arr[]=sl.toCharArray();
            
            char arr1[]=new char[s.length()];
            
            int ub=s.length();
            
            for(int i=0,j=(ub-1) ; i<ub/2 ; i++,j--)
            {
                    arr1[j]=arr[i];
                    arr1[i]=arr[j];
            }
            
            if(ub%2!=0)
                arr1[ub/2]=arr[ub/2];
           
//                String s1="";
//                for(int i=(arr.length-1); i>=0 ; i--)
//                {
//                    s1=s1+arr[i];
//                }
//                System.out.println(s1);
                
//            for(int i=ub-1; i>=0 ; i--)
//            {
//                System.out.print(arr[i]);
//            }
//            System.out.println();
//==================================           
//            for(int i=0; i<ub ; i++)
//            {
//                System.out.print(arr1[i]);
//            }
//            System.out.println();
            
            
            sl=String.valueOf(arr1);
            System.out.println(sl);
        }
}