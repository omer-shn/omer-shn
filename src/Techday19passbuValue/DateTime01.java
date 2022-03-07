package Techday19passbuValue;

import java.sql.SQLOutput;
import java.time.*;
import java.util.Date;


public class DateTime01 {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1.getTime());//milliseconds

        System.out.println(LocalDate.now()) ;//The current date using the system clock and default time-zone, not null

        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));

        //How to gate future date
        System.out.println(LocalDate.now().plusDays(200));
        System.out.println(LocalDate.now().plusMonths(25));

        //How to get past date
        System.out.println(LocalDate.now().minusWeeks(7));
        System.out.println(LocalDate.now().plusYears(2).minusMonths(5));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());

        System.out.println(LocalTime.now().getHour()+ ":"+ LocalTime.now().getMinute());
        System.out.println(LocalTime.now().isAfter(LocalTime.of(20,12,35))); //after from now
        System.out.println(LocalTime.now().isBefore(LocalTime.of(20,12,35)));//before from now


        // Compare 2 biethdays Ali 02/13/2005    Veli: 03/01/2007
        System.out.println(LocalDate.of(2005,2,13).isBefore(LocalDate.of(2007,03,01)));

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getMonthValue());

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));













    }
}
