package Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class As2 {
    public static void main(String[] args) {

        int sarr[] = {2, 5, 1, 7, 22, 9};

        try {
            Scanner scasn = new Scanner(System.in);
            System.out.println("Please input a number for index");
            int indx = scasn.nextInt();

            System.out.println("The element of index that you input is :" + sarr[indx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("You have exceed the index limit "+"\n"+e.getMessage());
        }catch (InputMismatchException g) {
            System.out.println("just input  pozitive number"+"\n"+g.getMessage());

        }
    }
}
