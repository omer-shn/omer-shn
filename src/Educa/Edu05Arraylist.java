package Educa;

import java.util.ArrayList;

public class Edu05Arraylist {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("bükme");
        food.add("hamırsız");
        food.add("UnHelvası");
        food.add("hambuger");

        food.set(0,"ekmek");  // pizza yerine ekmek gelir
        food.remove(4); // hamburger listeden silinir.
    //   food.clear(); // Tüm listeyi silmek için
        for(int i=0;i< food.size();i++) {
            System.out.println(food.get(i));
        }
        //
        System.out.println();
        //
        /* rows next to each other- yanyana sıralar*/
        ArrayList<ArrayList<String>> grocer =new ArrayList<>();

        ArrayList<String> bakery= new ArrayList<>();
        bakery.add("bread");
        bakery.add("donuts");
        bakery.add("muffın");
        bakery.add("pancake");

        ArrayList<String> greengrocer = new ArrayList<>();
        greengrocer.add("garlic");
        greengrocer.add("carrot");
        greengrocer.add("onion");
        greengrocer.add("parsley");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("soda");
        drinks.add("fruitjuice");
        drinks.add("buttermilk");

        grocer.add(bakery);
        grocer.add(greengrocer);
        grocer.add(drinks);

        System.out.println(grocer); // All list gets
        System.out.println(grocer.get(0)); // The first list gets
        System.out.println(grocer.get(1).get(3));// list 2, elements 4. (For beginning zero)
            //
        System.out.println();
        //

        /* Altalta sıralar*/
        String [] animals = {"cat","birds","sheep","horse"};

        for(String i :animals) {
            System.out.println(i);
        }
            //
        System.out.println();

            //
            /* Yine altalta sıralar  rows down*/
        ArrayList<String> animalss = new ArrayList<>();
        animalss.add("cat");
        animalss.add("birds");
        animalss.add("sheep");
        animalss.add("horse");
        for(String a :animals) {
            System.out.println(a);
        }
    }
}
