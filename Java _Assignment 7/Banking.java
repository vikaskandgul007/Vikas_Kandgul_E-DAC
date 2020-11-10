import java.util.Scanner;

class Manupulation
{
    static int min_balance=1000;

    void balance_enquiry()
    {
        int Balance= min_balance;
        System.out.println("Your account balance is "+Balance);
    }

    void withdraw(int amount)
    {
        if (min_balance-amount>=1000)
        {
            min_balance = min_balance-amount;

            System.out.println("Your account balance is "+ min_balance);
        }else
        {
            System.out.println("Your account balance too low "+ min_balance);

        }
    }

    void Credit(int amount)
    {
        min_balance= min_balance+amount;

        System.out.println("Your account balance is "+ min_balance);

    }


}
class Banking
{
    public static void main(String... R)
    {

        Manupulation M1=new Manupulation();
        Scanner input = new Scanner(System.in);

        String ch;
        int option;


        char y;
        do {
            System.out.println("Choose operation you want to perform...enter 0 to exit");
            System.out.println("1.balance enquiry");
            System.out.println("2.withdraw");
            System.out.println("3.credit");
            option = input.nextInt();


        if(1<=option && option<=3)
        {
            switch( option)

            {
                case 1:
                    M1.balance_enquiry();
                    break;

                case 2:
                    System.out.println("Enter withdraw amount.");
                    int amount = input.nextInt();
                    M1.withdraw(amount);
                    break;

                case 3:
                    System.out.println("Enter Credit amount.");
                    int amount1 =input.nextInt();
                    M1.Credit(amount1);
                    break;
            }
        }else
        {
            System.out.println("Please enter valid input");
        }


        System.out.println("you want to continue ");
        System.out.println("press Yes for yes or any key for No ");

        ch=input.next();
        


        }while(ch.equals("Y") );

                                                                       

    }

}