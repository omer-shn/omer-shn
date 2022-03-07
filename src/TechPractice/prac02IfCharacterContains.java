package TechPractice;
import java.util.Scanner;
public class prac02IfCharacterContains {
    public static void main(String[] args) {

         /*
Ask user to enter his kid's name,
if the name contains both "a" and "z"  output will be "This name contains 'a'"
if the name contains "a"               output will be "This name contains 'a'."
if the name contains "z"               output will be "This name contains 'z'."
Otherwise, output will be             "This name contains neither 'a' nor 'z'."
*/

                // FIRST WAY
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your kids name");
        String kidsName = scan.nextLine();
        String kidsNameLowerCase = kidsName.toLowerCase();
        boolean isContainA = kidsNameLowerCase.contains("a");
        boolean isContainZ = kidsNameLowerCase.contains("z");
        if (isContainA && isContainZ){
            System.out.println("This name contains 'a' and 'z'");
        } else if (isContainA){
            System.out.println("This name contains 'a'");
        } else if (isContainZ){
            System.out.println("This name contains 'z'");
        }else{
            System.out.println("This name contains neither 'a' nor 'z'");
        }

        //  SECOND WAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your kids name please..");
        String name = sc.nextLine().toLowerCase();
        if(name.contains("a") && name.contains("z") ){
            System.out.println("This name contains ‘a’ and 'z'");
        } else if (name.contains("a")){
            System.out.println("This name contains ‘a’");
        } else if (name.contains("z")){
            System.out.println("This name contains ‘z’");
        } else {
            System.out.println("This name contains neither ‘a’ nor ‘z’");
        }
    }
}
