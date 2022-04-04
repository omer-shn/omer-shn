package Lamda_Functional_Programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LamdaTest {
    public static void main(String[] args) {



    List<String> lam = new ArrayList<>();
    lam.add("Yevme");
    lam.add("Fasli");
    lam.add("Efece");
    lam.add("Inne");
    lam.add("Fekenet");
    lam.add("Enestu");

    getLast(lam);
        System.out.println();
    getLast1(lam);
        System.out.println();
    getLast2(lam);
        System.out.println();
    getLast3(lam);
        System.out.println();
    getLast4(lam);
        System.out.println();
    getLast5(lam);
        System.out.println();
    getLast6(lam);
}
public static void getLast(List<String>tek) {
    System.out.println(tek.stream().sorted(Comparator.comparing(t->t.toString().length())).findFirst());
    System.out.println(tek.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst());

}
    public static void getLast1(List<String>tek) {
    tek.stream().map(t->t.toUpperCase()).limit(2).forEach(UtilsDt::printInTheSameLineWithSpace);


    }
    public static void getLast2(List<String>tek) {
        tek.stream().map(t->t.toLowerCase()).limit(3).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    public static void getLast3(List<String>tek) {
        tek.stream().filter(t->t.startsWith("e")).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    public static void getLast4(List<String>tek) {
        System.out.println((tek.stream().allMatch(t->t.length()>=5))? "Yes,there is" : "there is no ");
        System.out.println((tek.stream().sorted().anyMatch(t->t.length()>=5))? "Yes,there is" : "there is no ");
        System.out.println((tek.stream().noneMatch(t->t.length()>=5))? "Yes,there is" : "there is no ");
        tek.stream().filter(t->t.length()<=4).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    public static void getLast5(List<String>tek) {
        tek.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.length()-1))).forEach(UtilsDt::printInTheSameLineWithSpace);
        System.out.println();
        tek.stream().sorted(Comparator.comparing(UtilsDt::getStartWtih)).forEach(UtilsDt::printInTheSameLineWithSpace);
        System.out.println();
        tek.stream().map(UtilsDt::getStartWtih).forEach(UtilsDt::printInTheSameLineWithSpace);
        System.out.println();
        tek.stream().map(t->t.toString().charAt(t.length()-1)).forEach(UtilsDt::printInTheSameLineWithSpace);
    }
    public static void getLast6(List<String>tek) {
        tek.stream().sorted().skip(2).forEach(UtilsDt::printInTheSameLineWithSpace);
    }

}
