package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class As3 {
    //To reach a file in Java we give help from "FileInputStream" class.
    public static void main(String[] args) throws IOException {

        FileInputStream fil = new FileInputStream("src/Classes/Astek.txt");
        int g = 0;
        while ((g = fil.read()) != -1) {
            System.out.print((char) g);

        }
        System.out.println("\noperation ok");



    }
}
