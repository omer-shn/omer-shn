package Techday23inheritanceextra;

import javax.sound.midi.Soundbank;

public class Common {

  private   String name;
  private   String surname;
  private int age;
  private   int phone;

    public Common(String name,String surname, int age, int phone) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.phone=phone;
    }
    public void print() {
        System.out.println("Name :"+this.name);
        System.out.println("Surname :"+this.surname);
        System.out.println("Age :"+this.age);
        System.out.println("Phone :"+this.phone);
    }
}
