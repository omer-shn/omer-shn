package Classes;

public class ThisConstructorCall {
                    //Class'ın Çalışma Sırası
    int x=5;

    ThisConstructorCall() {                    //5  tekrar döndüğünde  10. işlem olur
        System.out.println("-x" + x);       //6     tekrar döndüğünde  11. işlem olur
    }
    ThisConstructorCall(int x) {  //3
        this();                     //4       this bir cons'da sadece bir tane olur ve ilk satıra yazılır.
        System.out.println("-x"+x);         //7
    }                                       //8

    public static void main(String[] args) {   // 1
        ThisConstructorCall conscall = new ThisConstructorCall(4);  //2
        ThisConstructorCall conscall1 = new ThisConstructorCall();  //9
    }
}
