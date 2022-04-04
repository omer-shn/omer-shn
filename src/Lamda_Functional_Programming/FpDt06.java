package Lamda_Functional_Programming;

import java.util.*;
import java.util.stream.Collectors;

public class FpDt06 {
    public static void main(String[] args) {
        TechPro trGunduz=new TechPro("yaz","TR gunduz",97,124);
        TechPro engGunduz=new TechPro("kis","ENG gunduz",95,141);
        TechPro trGece=new TechPro("bahar","TR gece",98,143);
        TechPro engGece=new TechPro("sonbahar","ENG gece",99,171);

        List<TechPro> lis =new ArrayList<>(Arrays.asList(trGunduz,engGunduz,trGece,engGece));

        System.out.print(batchAvera(lis));
        System.out.println();
        System.out.println(numberoFStudent(lis));
        System.out.println();
        System.out.println(batchBahar(lis));
        System.out.println();
        System.out.println(studentNum(lis));
        System.out.println();
        System.out.println(ilkUcSıra(lis));
        System.out.println();
        System.out.println(ikinciSıra(lis));
        System.out.println();
        System.out.println(bigThan95(lis));
        System.out.println();
        System.out.println(biggTThan95(lis));
        System.out.println();
        System.out.println(averageThan130(lis));
        System.out.println();
        System.out.println(dayStudents(lis));
        System.out.println();
        System.out.println(batchStuAve(lis));
        System.out.println();
        System.out.println(batchSmallAve(lis));
    }
   //ortalaması 92 den büyükmü *
    public static boolean batchAvera(List<TechPro>list) {
      return  list.stream().allMatch(t->t.getBatcave()>92);
    }
    //öğrenci sayıları 110 dan az mı çok mudur
    public static boolean numberoFStudent (List<TechPro>list){
      return  list.stream().noneMatch(t->t.getNunOfStudent()<110);
    }
    //Batch'ların herhangi birinde "bahar" olup olmadığını kontrol.
    public static boolean batchBahar(List<TechPro>list) {
        return list.stream().anyMatch(t->t.getBatch().equals("bahar"));
    }
    //Batch'ları öğrenci sayısına göre sıralama.
    public static List<TechPro> studentNum(List<TechPro>list){
        return  list.stream().sorted(Comparator.comparing(TechPro::getNunOfStudent).reversed()).collect(Collectors.toList());
    }
    //Batch ortalmasına göre tersten sıralama ve ilk üçünü yazdır
    public static List<TechPro> ilkUcSıra(List<TechPro>list) {
        return list.stream().sorted(Comparator.comparing(TechPro::getBatcave).reversed()).limit(3).collect(Collectors.toList());
    }
    //Batch'de öğrenci sayısı en az olan 2.batch'ı yazdırma
    public static List<TechPro> ikinciSıra(List<TechPro>list){
        return list.stream().sorted(Comparator.comparing(TechPro::getNunOfStudent)).limit(2).skip(1).collect(Collectors.toList());
    }
    //Batch ortalaması 95 den büyük olanların öğrenci sayılarının toplamını getirme
    public static Optional<Integer> bigThan95(List<TechPro>list){
        return list.stream().filter(t->t.getBatcave()>95).map(t->t.getNunOfStudent()).reduce(Integer::sum);
    }
    public static int biggTThan95(List<TechPro>list){
        return list.stream().filter(t->t.getBatcave()>95).mapToInt(t->t.getNunOfStudent()).sum();
    }
    //Batch'da öğrenci sayıları 130 dan fazla olanların ortalmasını getir.
    public static OptionalDouble averageThan130 (List<TechPro>list){
        return list.stream().filter(t->t.getNunOfStudent()>130).mapToDouble(t->t.getBatcave()).average();

    }
    //Batch!de gündüz öğrencilerinni sayısı
    public static int dayStudents(List<TechPro>list){
        return (int) list.stream().filter(t->t.getBatchName().contains("gunduz")).count();
    }
    //Batch'de öğrenci satyısı 130 dan fazla olanların Batch ortalmasını bulunuz.
    public static OptionalDouble batchStuAve(List<TechPro>list){
        return list.stream().filter(t->t.getNunOfStudent()>130).mapToDouble(t->t.getBatcave()).max();
    }
    //Batch'de öğrenci sayısı 150 den az olanların en çük ortalması
    public static OptionalDouble batchSmallAve(List<TechPro>list){
        return list.stream().filter(t->t.getNunOfStudent()<150).mapToDouble(t->t.getBatcave()).min();
    }





}
