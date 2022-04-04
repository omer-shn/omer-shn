package Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

    static List<Book> bookList =new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static int bookno=1000;

    public static void main(String[] args) {
        BookMethod.addbooks(bookList);
       BookMethod.menu(bookList);

    }

  /*  public static void menu(List<Book>list) {
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

    private static void Finish(List<Book> list) {
    }

    private static void Showbooks(List<Book> list) {
        for(Book k :list) {
            System.out.println(k.toString());
        }
        menu(list);
    }

    private static void Deletebook(List<Book> list) {
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

    private static void Addbook(List<Book> list) {
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

   */
}
