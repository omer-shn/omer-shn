package Techday16ArraysSplit;

public class DateSplit {
    public static void main(String[] args) {


        String date = "25/02/2022";
        String [] dates =date.split("/");
        for(String each: dates ) {
            System.out.println(each);
        }


        //SECOND WAY
        System.out.println("day:"+date.split("/")[0]);
        System.out.println("Month:"+date.split("/")[1]);
        System.out.println("Year:"+date.split("/")[2]);

        //THIRD WAY

        System.out.println("day:"+dates[0]);
        System.out.println("Month:"+dates[1]);
        System.out.println("Year:"+dates[2]);


    }
}
