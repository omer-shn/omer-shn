package Techday34LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LocalTimeee {

    public static void main(String[] args) {

        //LocalDate

        LocalDate tar = LocalDate.now();
        System.out.println(tar);

        System.out.println(tar.getDayOfYear());
        System.out.println(tar.getDayOfMonth());
        System.out.println(tar.plusDays(20));
        System.out.println(tar.plusMonths(5));
        System.out.println(tar.plusWeeks(15));
        System.out.println(tar.plusYears(10).plusMonths(10).plusDays(10));
        System.out.println(tar.minusWeeks(20));
        System.out.println(tar.minusYears(5).minusMonths(5).minusDays(5));
        System.out.println(tar.minusYears(22).isLeapYear());

        LocalDate bornday =LocalDate.of(1998, Month.JANUARY,12);
        LocalDate bornday2=LocalDate.of(2000,01,12);

        System.out.println(bornday+", "+bornday2);
        System.out.println(bornday.isAfter((bornday2)));
        System.out.println(bornday.isBefore(bornday2));


        //LocalTime

        LocalTime saat = LocalTime.now();
        System.out.println("Starts :"+saat);

        int sayi =10;
        for(int i=0;i<10000;i++){
            sayi++;  }

        LocalTime saatEnds =LocalTime.now();
        System.out.println("Ends :"+saatEnds);

        double nano1=saat.getNano();
        double nano2=saatEnds.getNano();
        System.out.println("forLoop "+(nano2-nano1));

        LocalTime saatS = LocalTime.now();
        System.out.println("Starts :"+saatS);

        String str ="hour";
        for(int i=0;i<10000;i++){
            str+=" ";  }

        LocalTime saatEndsS =LocalTime.now();
        System.out.println("Ends :"+saatEndsS);

        double nano1s=saat.getNano();
        double nano2s=saatEndsS.getNano();
        System.out.println("forLoop "+(nano2s-nano1s));

        LocalTime localhour= LocalTime.now(ZoneId.of("Japan"));
        System.out.println(localhour);

        LocalTime localhour2= LocalTime.now(ZoneId.of("Iran"));
        System.out.println(localhour2);


        // LocalDateTime

        LocalDateTime tarihSaat =LocalDateTime.now();
        System.out.println(tarihSaat);

        System.out.println(tarihSaat.toString().startsWith("2022"));


        //DateTimeFormatter

        DateTimeFormatter arrange =DateTimeFormatter.ofPattern("dd / MMMM / YYYY EEE HH:mm");
        System.out.println(arrange.format(tarihSaat));



    }




}
