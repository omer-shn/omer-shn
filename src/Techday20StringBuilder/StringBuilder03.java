package Techday20StringBuilder;

public class StringBuilder03 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();

        sb.append("Enesus");
        sb.append("!!!");
        sb.insert(7," tut");


        System.out.println(sb);
        System.out.println(sb.indexOf("n"));
        System.out.println(sb.delete(8,9));

        StringBuilder seb = new StringBuilder();
        seb.append("very successful");
        System.out.println(sb.insert(7, seb,5,15));//sb objesine (Enesus) seb objesinin 5-15 arası karakterini ekler
    }

}

