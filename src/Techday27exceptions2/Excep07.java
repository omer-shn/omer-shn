package Techday27exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excep07 {

    //When you type code, Java will give you red underline for some Exceptions before runnig the code
    // That kind of Exceptions are called "Compile time Exception"(Checked Exception)
    // FileNotFoundException : This exception is thrown if the path is wrong or the files does not exist
    //IO Exception (input-output): This Exception handless all issues related with Input or Output
    //Note: FileNotFoundException" is the child of "IOException"
    //If there is parent-child relationship between exception classes, Child Exception Class must come before
      //Parent Exception Class in multiple catch-block usage.
    // To execute to code block under every condition ,put the code inside the "finally-block"
    // try-block cannot be use alone,
    //try-block can be used with a single catch block
    //try-block can be used with multiple catch block
    //try-block can be used with just catch block
    //try-block can be used with single or multiple catch-block and finally-block

    public static void main(String[] args) {
        goAndReadTheFile();

    }
    public static void goAndReadTheFile(){

        try {
            FileInputStream fis = new FileInputStream("src/Techday27exceptions2/File01.txt");//Go and find the File (done)

            int k=0;
            while ((k=fis.read())!=-1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about reahing out the file or existence of the file"+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Connection with cloud was broken");
        }


    }
}
