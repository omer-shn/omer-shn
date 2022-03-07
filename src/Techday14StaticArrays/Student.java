package Techday14StaticArrays;

public class Student {

    String name;
    int year;
    static int counter =1000;
    String studentId;

    public String setStudent(){
        counter++;
        studentId = year + "" + counter;
        return studentId;


    }
}
