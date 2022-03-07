package Techday11DoWhile;

public class ConstructorsTrying {
                // FIRST STEP
    String ki;
    String hi;
    String bi;
    String ci;
    int    a;
    int    b;
                // SECOND STEP
    public ConstructorsTrying() {

    ki = "kilimin üstündeki ";
    hi = " kitaptan " ;
    bi = " tanesi benim";
    a = 3;
    b=  1;
    ci= ki+a+hi+b+bi;

    }
                //THIRD STEP
    public static void main(String[] args) {
        ConstructorsTrying myWord = new ConstructorsTrying() ;

        System.out.println(myWord.ci);


        }


    }



















