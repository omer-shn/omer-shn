package Techday04;

public class IfStatements02 {
    public static void main(String[] args) {

      /*  Scanner scan = new Scanner(System.in);

        System.out.println("Enter a month name");
        String month = scan.next().toLowerCase();

                // CAUTION!!! String datatype de büyük-küçk harf duyarlılığı yoktur.

        /*
        if(month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("Spring");
        }else if(month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("Summer");
        } else if(month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("Autumn");
        } else if(month.equals("december") || month.equals("january") || month.equals("fabruary")) {
            System.out.println("winter");
        }
            else{
                System.out.println("This is not a month day");
            }

         */

                    // SECOND EXAMPLE

        System.out.println(5>4); // consol'da true çıkar
        System.out.println(4>5);// false çıkar
        System.out.println(5>4 || 4>5); // true, (işaret veya)
        System.out.println(5>4 && 4>5);// false (işaret ve)
        System.out.println(5<4 || 3+4==7);//true
        System.out.println(5<4 && 3+4==7);//false

        //  THIRD EXAMPLES
        // işarete göre (&& -||) pc alabilir yada alamaz
        boolean cash =true;
        boolean creditCard =true;

        if (cash || creditCard) {
            System.out.println("i can buy a pc");
        } else {
            System.out.println("i can not buy a pc");
        }

        // FOURT EXAMPLES

        boolean havingPC =true;
        boolean watcingVideos =false;

        if (havingPC && watcingVideos) {
            System.out.println("i can learn java");
        } else {
            System.out.println("i can not learn java");
        }
    }
}
