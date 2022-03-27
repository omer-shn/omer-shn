package Techday29interface;

public interface AirCondition extends Vehicle{

    /*
    Interface is not a class, but it is an Interface
    A class sould be able to use multiple Interfaces as parent.
    In a interface, most methods are abstract but we can still use same concrete methods that are static and default
    we dont need to use abstract keyword for an Interface(for Interface name)
    If we use a variable in an Interface, we need to assign a value.
    In abstract class we can have cons.
    but in Interface we cannot have cons.
    Interface cannot have concrete methods other than default and static, but astract claass canhace concrete
    so in Java, whhen we use final variables should be written in upperCase letters
     */
    String MAKE ="Samsung";

    public abstract void electronicAc();

    public void climate();

    void bacteraKiller();

    void run();

    public default int power(){

        System.out.println("Hybrid enginesare increasing their power");
        return 1000;
    }
    public static String model() {
        System.out.println("The best model..");
        return "The best...";
    }



}
