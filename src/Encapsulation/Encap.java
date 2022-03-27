package Encapsulation;

public class Encap {

    private String gender = "Male";
    private int age=23;
    private boolean disabled= false;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public boolean isDisabled() {
        return disabled;
    }
    public void setDisabled(boolean disabled){
        this.disabled =disabled;
    }
    public String getGender(){
        return gender;
    }

    public static void main(String[] args) {
        Encap en =new Encap();
        System.out.println(en.getAge());

        en.setAge(25);
        System.out.println(en.getAge());

        System.out.println(en.isDisabled());
        en.setDisabled(true);
        System.out.println(en.isDisabled());
    }
}
