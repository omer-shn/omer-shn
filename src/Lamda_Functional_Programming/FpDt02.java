package Lamda_Functional_Programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FpDt02 {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<Integer>();
        li.add(8);
        li.add(9);
        li.add(13);
        li.add(10);
        li.add(9);
        li.add(10);
        li.add(2);
        li.add(8);
        li.add(11);

        printElementsFunctional(li);
        System.out.println();
        printEvenElementsFunctional(li);
        System.out.println();
        printSquareOfOddElements(li);
        System.out.println();
        printCubeOfDistinctElements(li);
        System.out.println();
        sumOfSquaresDistinctEvenElements(li);
        sumOfSquaresDistinctEvenElements2(li);
        productsOfCubesEventElements(li);
        getMaxElement01(li);
        getMinimumEvenGreaterThanSeven01(li);
        getMinElement(li);
        getHalfOfDistinctElementsGreaterThanFive(li);
    }
    //1)Create a method to print the list elements on the console in the same line with a space between consecutive elements(Functional)
    public static void printElementsFunctional(List<Integer>list) {
        list.stream().forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(UtilsDt::checkToBeEven).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    // space between two consecutive elements.(Functional)
    //   odd ==> square ==> print
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(UtilsDt::checkToBeOdd).map(UtilsDt::getSquare).forEach(UtilsDt::printInTheSameLineWithSpace);
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line.
    //with a space between two consecutive elements.
    public static void printCubeOfDistinctElements(List<Integer> list){
        list.stream().filter(UtilsDt::checkToBeOdd).distinct().map(UtilsDt::getCube).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
        //1.WAY
    //Create method to calcualte the sum of the squares os distimct even elements
    public static void sumOfSquaresDistinctEvenElements(List<Integer>list) {
     Integer sum=   list.stream().distinct().filter(UtilsDt::checkToBeEven).map(UtilsDt::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }
    //2.way
    public static void sumOfSquaresDistinctEvenElements2(List<Integer>list) {
        Integer sum = list.stream().distinct().filter(UtilsDt::checkToBeEven).map(UtilsDt::getSquare).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    //Create method to calcualte the sum of the squares os distimct even elements

    public static void productsOfCubesEventElements(List<Integer>list) {
     Integer product =   list.stream().distinct().filter(UtilsDt::checkToBeEven).map(UtilsDt::getCube).reduce(1,Math::multiplyExact);
        System.out.println(product);
    }
    //Create a method to find the maximum value from the list elements
    //1.way
    public static void getMaxElement01(List<Integer> list){
    Integer max =    list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);
    }
    //Homework
    //Create a method to find the min value from the list elements

    public static void getMinElement(List<Integer>list) {
        Integer mn = list.stream().distinct().reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(mn);
    }

    //Create a method to find the minimum value which is greater than 7 and even from the list
    //more than 7, even, min value
    public static void getMinimumEvenGreaterThanSeven01(List<Integer> list){
     Integer min=  list.stream().distinct().filter(t->t>7).filter(UtilsDt::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);
    }

    //8)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    //distinct, filter, map, sorted,
    public static void getHalfOfDistinctElementsGreaterThanFive(List<Integer> list){
    List<Double> result=    list.stream().distinct().filter(t->t>5).map(UtilsDt::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }




}
