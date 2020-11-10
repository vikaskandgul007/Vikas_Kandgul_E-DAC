import java.util.*;
class Simpleinterest
{
    int princ;
    int rate;
    int years;
    Scanner sc=new Scanner(System.in);
    
    Simpleinterest()
    {
        System.out.print("Enter Principal: ");
        princ=sc.nextInt();
        System.out.print("Enter Rate: ");
        rate=sc.nextInt();
        System.out.print("Enter Years: ");
        years=sc.nextInt();
    }
    
    float CalculateSI()
    {
        float si=(princ*rate*years)/100.0f;
        return si;
    }
    
}
    
class SimInterest
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Simpleinterest s=new Simpleinterest();
        
        System.out.println("SI: Rs."+s.CalculateSI());
     }
}