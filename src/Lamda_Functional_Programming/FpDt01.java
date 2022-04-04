package Lamda_Functional_Programming;

import java.util.ArrayList;
import java.util.List;

public class FpDt01 {
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
        printElementStructured(li);
        System.out.println();
        printElementsFunctional(li);
        System.out.println();
        printEventElementStructured(li);
        System.out.println();
        printEventElementsFunctional(li);
        System.out.println();
        printSquareOfOddElements(li);
        System.out.println();
        printCubeOfDistinctOddElements(li);
        System.out.println();
        sumOfSquareOfDistinctEventElements(li);
        System.out.println();
        productOfCubesOfDistinctEvenElements(li);
        System.out.println();
        getMaxElement01(li);
        getMaxElement02(li);
       getMinGreaterThanSeven(li);
        printElementsFunctional(li);

    }
    public static void printElementStructured(List<Integer>list) {

        for(Integer w : list) {
            System.out.print(w+" ");
        }
    }

    public static void printElementsFunctional(List<Integer>list) {
        list.stream().forEach(t->System.out.print(t+" "));
    }

    public static void printEventElementStructured(List<Integer>list) {
        for(Integer w :list) {
            if(w%2==0) {
                System.out.print(w+" ");

            }
        }
    }

    public static void printEventElementsFunctional(List<Integer>list) {
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    public static void printSquareOfOddElements(List<Integer>list) {
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }

    public static void printCubeOfDistinctOddElements(List<Integer>list) {
        list.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t->System.out.print(t+" "));
    }

    public static void sumOfSquareOfDistinctEventElements(List<Integer>list){
      Integer sum=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->(+u));
        System.out.println(sum);
    }

    public static void productOfCubesOfDistinctEvenElements(List<Integer>list) {
        Integer product =list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(product);
    }
    public static void getMaxElement01(List<Integer>list) {
      Integer max=  list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t :u);
        System.out.println(max);
    }

    //second Way
    public static void getMaxElement02(List<Integer>list) {
        Integer max =list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println(max);
    }
    public static void  getMinGreaterThanSeven(List<Integer>list) {
     Integer min=   list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println(min);
        }

     public static void printElementsFuntional(List<Integer>list) {
     Integer max  = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
         System.out.println(max);
     }


}
