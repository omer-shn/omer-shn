package ZSpecial;

public class İpekYoluFirstLETTERS {
    public static void main(String[] args) {

        String pak ="İpek Yolu";
        String fipek= pak.substring(0,1);
        System.out.print(fipek);
        int fy= pak.indexOf(" ")+1;
        String fyolu=pak.substring(fy,fy+1);
        System.out.println(fyolu);


        String fi = "life is short";
        String se =fi.substring(0,1).toUpperCase();
        int th= fi.indexOf(" ")+1;
        int th2= fi.indexOf(" ")+fi.indexOf(" ");
        String fo= fi.substring(th,th+1).toUpperCase();
        String fo2 =fi.substring(th2,th2+1).toUpperCase();
        System.out.println(se+" "+fo+" "+fo2);


    }
}
