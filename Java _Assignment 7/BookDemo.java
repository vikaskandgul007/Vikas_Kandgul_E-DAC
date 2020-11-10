import java.util.Scanner;

class Book{
    Scanner input = new Scanner(System.in);
    int bookid,price;
    String name;
        void getdata()
        {
            System.out.println("Enter the Name of book");
            name=input.nextLine();
            System.out.println("Enter the Book Id");
            bookid=input.nextInt();
            System.out.println("Enter the Price");
            price=input.nextInt();
        }

}
public class BookDemo{

    void compare(Book a1,Book a2,Book a3)
    {
        if (a1.price>a2.price && a1.price>a3.price)
        {
            System.out.println("Book with highest price: "+a1.name);

        }else if(a2.price>a3.price)
        {
            System.out.println("Book with highest price: "+a2.name);
        }else
        {
            System.out.println("Book with highest price: "+a3.name);
        }

    }

    public static void main(String... T) {
        Book a1= new Book();
        a1.getdata();
        Book a2=new Book();
        a2.getdata();
        Book a3 = new Book();
        a3.getdata();

        BookDemo demo=new BookDemo();

        demo.compare(a1,a2,a3);

    }

}