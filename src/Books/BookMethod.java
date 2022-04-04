package Books;

import java.util.List;
import java.util.Scanner;

public class BookMethod {
    static Scanner scan =new Scanner(System.in);
    static int bookno=1000;

    public static void menu(List<Book> list) {

        System.out.println("=====Book Menu=====\n1: Add book\n2: Delete book\n3: Show All book\n4: Finish");

        System.out.println("choose your operate");
        int refer = scan.nextInt();

        switch (refer) {
            case 1 : Addbook (list);
                break;
            case 2 : Deletebook(list);
                break;
            case 3: Showbooks (list);
                break;
            case 4:Finish(list);
                break;
            default:
                System.out.println("something went wrong");
        }


    }



    public static void Finish(List<Book> list) {
    }

    public static void Showbooks(List<Book> list) {
        for(Book k :list) {
            System.out.println(k.toString());
        }
        menu(list);
    }

    public static void Deletebook(List<Book> list) {
        System.out.println("input booknumber to delete");
        int del = scan.nextInt();
        for (Book b:list){
            if(b.getNo()==del) {
                list.remove(b);
                menu(list);
            }
        }
        System.out.println(del+ "no book!!");
        menu(list);
    }

    public static void addbooks(List<Book>list) {
        Book book1=new Book("sefiller","victorHugo",1890,35,++bookno);
      Book  book2=new Book("Karaagac","IbrahimSerin",2008,29,++bookno);
       Book book3=new Book("Nehre Dusen","Hasan Kilic",1990,25,++bookno);
       list.add(book1);
       list.add(book2);
       list.add(book3);

    }

    public static void Addbook(List<Book> list) {
        System.out.println("input book name");
        String bookName=scan.next();
        scan.nextLine();
        System.out.println("input aouthor name");
        String authorName = scan.next();
        System.out.println("input press year");
        int pressYear = scan.nextInt();
        System.out.println("input price");
        double price= scan.nextDouble();
        Book book= new Book(bookName,authorName,pressYear,price,++bookno);
        list.add(book);
        System.out.println(book.toString());
        menu(list);
    }

}
