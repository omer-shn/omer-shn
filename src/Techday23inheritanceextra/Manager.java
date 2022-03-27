package Techday23inheritanceextra;

public class Manager extends Common{

    private String spor="Eater sports";

    public Manager(String name,String surname, int age, int phone, String spor) {

        super(name,surname,age,phone);
        this.spor=spor;
    }
    public void pro(String project) {
        System.out.println("New Project :"+project);
    }
}
