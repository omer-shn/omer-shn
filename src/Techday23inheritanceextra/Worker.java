package Techday23inheritanceextra;

public class Worker extends Common {

   private String school;

    public Worker(String name,String surname, int age, int phone, String school) {
        super(name,surname,age,phone);
        this.school=school;
    }
}
