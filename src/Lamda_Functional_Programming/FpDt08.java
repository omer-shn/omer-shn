package Lamda_Functional_Programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FpDt08 {


    public static void main(String[] args) throws IOException {
        //Abc dosyasına erişerek içeriği yazdır
        Files.lines(Paths.get("src/Lamda_Functional_Programming/Abc.txt")).forEach(System.out::println);

    //Abc dosyasının içeriğini upperCase yap
        Files.lines(Paths.get("src/Lamda_Functional_Programming/Abc.txt")).map(String::toUpperCase).forEach(System.out::println);

       //Abc dosyası ilk satırı küçük harf yap
        Files.lines(Paths.get("src/Lamda_Functional_Programming/Abc.txt")).limit(1).map(String::toLowerCase).forEach(System.out::println);//limit yerine findFirst kullanılabilir.

       //Abc dosyasında step kelimesi kaç satırda geçer
        System.out.println(Files.lines(Paths.get("src/Lamda_Functional_Programming/Abc.txt")).filter(t->t.contains("step")).count());

      // Abc dosyasında farklı kelimeleri yazdır
        System.out.println(Files.lines(Paths.get("src/Lamda_Functional_Programming/Abc.txt")).map(t->t.split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
    }




}
