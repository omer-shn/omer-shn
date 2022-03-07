package Techday14StaticArrays;

public class StudentRunner {
    public static void main(String[] args) {

        // To access class members "class name" is enough to accsess

        System.out.println(Student.counter);

        // To access non-ststic class members you have to creater an object
        Student std1 = new Student();

        System.out.println(std1.setStudent());


    }
}