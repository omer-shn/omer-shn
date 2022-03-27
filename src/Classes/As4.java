package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class As4 {
    public static void main(String[] args) throws  FileNotFoundException{


        try {
            FileInputStream fil = new FileInputStream("src/Classes/Astext.txt");
            int k = 0;
            while ((k = fil.read()) != -1) {
                System.out.print((char) k);
            }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\noperation ok");

    }
    }

