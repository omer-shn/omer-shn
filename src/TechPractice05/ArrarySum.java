package TechPractice05;

public class ArrarySum {
    public static void main(String[] args) {

        /*
         * Create a method that can add the even numbers in the array
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 30
         */
        int array [][] = {{1,3,6},{2,8},{5,7,9,14}};
        int brr [][] = {{1,4,6},{2,8},{5,7,10,14}};
        sumOfEvens(array);
        sumOfEvens(brr);
    }
    //                 void
    public static void sumOfEvens(int array [][]){
        int sum = 0;
        for( int m [] : array){
            for (int w : m){
                if(w % 2 == 0){
                    sum = sum + w;
                }
            }
        }
        System.out.println(sum);
      //  return sum;  eğer void yerine datatype'lerden birini kullanırsak örnek int ozaman return seçeneğini
       // yazarız

    }
    }




