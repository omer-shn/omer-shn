package Classes;

public class Student {

    String name;
    int  idnumber;
    String phone;

    Student(){}
    public Student (String name,int idnumber,String phone) {
        this.name=name;
        this.idnumber=idnumber;
        this.phone=phone;

    }

    public static void main(String[] args) {
        Student one =new Student();
        Student first =new Student("Mesa",15,"234-0754534");
        System.out.println(first.name+" "+ first.idnumber+" "+first.phone);
    }
}
