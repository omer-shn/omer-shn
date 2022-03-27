package Techday27exceptions2;

public class Excep05 {
    public static void main(String[] args) {

        String s="Hello";
        getCharacterFromAStringByIndex(s,2); //l
        getCharacterFromAStringByIndex(s,6); //Exception =>String index out of range:6

        divideTheLengths(s,1,5,1);

    }

    public static void getCharacterFromAStringByIndex(String str, int idx){


        try {System.out.println(str.charAt(idx));
    } catch (StringIndexOutOfBoundsException g) {
            System.out.println("An issue occured in character selection ==>" +g.getMessage());
        }
        }
        public static void divideTheLengths(String str,int idx1, int idx2,int idx3) { //Hello! 1  5  3

            try {
                int firstlength =str.substring(idx1,idx2).length(); // 4 ==>ello
                int secondlength=str.substring(idx1,idx3).length();  //2 ==>el
                System.out.println(firstlength/secondlength); // 4 / 2 = 2

            }catch (ArithmeticException e) {
                System.out.println("An issue occured in division =>"+e.getMessage());

            }catch (StringIndexOutOfBoundsException e) {
                System.out.println("An issue occured in character selection ==>"+ e.getMessage());

                // we csn use multiple catch key
                //when you use multiple catch block just one of them can be executed at the same time
                //try block cannot be used alone

            }

        }



}
