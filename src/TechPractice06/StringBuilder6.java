package TechPractice06;

public class StringBuilder6 {
    public static void main(String[] args) {

        join("Dear","Ali","Can","we","miss","you");
    }
    public  static void join(String...str){
        String result= "";
        for(String each : str) {
            result = result + each + "";
        }
        System.out.println(result);
    }
}
