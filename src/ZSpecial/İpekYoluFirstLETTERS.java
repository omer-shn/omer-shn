package ZSpecial;

public class İpekYoluFirstLETTERS {
    public static void main(String[] args) {

        String pak ="İpek Yolu";
        String fipek= pak.substring(0,1);
        System.out.print(fipek);
        int fy= pak.indexOf(" ")+1;
        String fyolu=pak.substring(fy,fy+1);
        System.out.println(fyolu);


    }
}
