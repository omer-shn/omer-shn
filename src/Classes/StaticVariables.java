package Classes;

public class StaticVariables {

    static int count = 0;

    public void increment() {
        count++;
    }

    public static void main(String[] args) {  //Program çalışmaya bu satırdan başlar
        StaticVariables obj1 = new StaticVariables();

        StaticVariables obj2 = new StaticVariables();
        obj1.increment();
        obj2.increment();

        System.out.println(obj1.count);
        System.out.println(obj2.count);



    }

}