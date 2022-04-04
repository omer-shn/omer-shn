package Lamda_Functional_Programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class FpDt03 {

    public static void main(String[] args) {

        List<String> lis = new ArrayList<>();
        lis.add("Ali");
        lis.add("Ali");
        lis.add("Mark");
        lis.add("Amanda");
        lis.add("Christopher");
        lis.add("Jackson");
        lis.add("Mariano");
        lis.add("Alberto");
        lis.add("Tucker");
        lis.add("Benjamin");

        List<Integer> lip =new ArrayList<>();
        lip.add(15);
        lip.add(75);
        lip.add(85);
        lip.add(35);
        printEvenNumber(lip);
        System.out.println();

        printInUpperCases01(lis);
     //   printInUpperCases02(lis);
        System.out.println();
        printElemntsSortedByLenght(lis);
        System.out.println();
        printElemntsReversedSortedByLength(lis);
        System.out.println();
        printDistinctSortedByLastChar(lis);
        System.out.println();
        printSortedByLenghtThenSortedByInitial(lis);
        System.out.println();
     //   removeIfTheElemntisGrearetrThanFive(lis);
        printRemoveIfEndingWithAorN(lis);
        printRemoveIfEndingWithAorN2(lis);

    }

        //Ctreater a method to print all list elements in uppercase
        //1.way
     public static void printInUpperCases01(List<String>list) {
        list.stream().map(String::toUpperCase).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
        //2.way
   // public static void printInUpperCases02(List<String>list) {
    //   list.replaceAll(String::toUpperCase);
     //   System.out.println(list);
   // }

        //Create a method to print the elements after ordering according to their lengths
    public static void printElemntsSortedByLenght(List<String>list) {
        list.stream().sorted(Comparator.comparingInt(String::length)).forEach(UtilsDt::printInTheSameLineWithSpace);
    }

    // Create a method to print the elemnts after ordering according to their tlengts (in reverse order)
    public static void printElemntsReversedSortedByLength(List<String>list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsDt::printInTheSameLineWithSpace);
    }

    //Create a method to sort the distinct elements by using their last characters
    public static void printDistinctSortedByLastChar(List<String>list) {
        list.stream().distinct().sorted(Comparator.comparing(UtilsDt::getLastChar)).forEach(UtilsDt::printInTheSameLineWithSpace);
    }

    //create a method to sort the elements according to their lengths then according to their first character
    public static void printSortedByLenghtThenSortedByInitial(List<String>list) {

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    //Remove the elements if the length of the elemn is greater than 5
  //  public static void removeIfTheElemntisGrearetrThanFive(List<String> list) {
    //    list.removeIf(t -> t.length() > 5);
      //  System.out.println(list);
   // }

    //Remove the elements if the elemnt is starting with 'A', 'a', or ending with 'N', 'n'
    //1.way
    public static void printRemoveIfEndingWithAorN(List<String>list) {
        list.removeIf(t->t.charAt(0)=='A'|t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }
    //2.way
    public static void printRemoveIfEndingWithAorN2(List<String>list) {
        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(list);
    }

    public static void printEvenNumber(List<Integer>list) {
        list.stream().distinct().filter(UtilsDt::checkToBeOdd).filter(t->t<40).forEach(UtilsDt::printInTheSameLineWithSpace);

    }

}
