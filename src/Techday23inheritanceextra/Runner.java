package Techday23inheritanceextra;

public class Runner {
    public static void main(String[] args) {

        Worker wor =new Worker("Ray","Life",29,417092117,"Oxford Univercity");
        wor.print();
        System.out.println("=========================");
        Manager man=new Manager("Bilal","Gunes",46,22163305,"Water Sports");
        man.print();
        man.pro("Ok");

        /*
        Şimdi burada ne yaptık onu inceleyelim.

Calisan, Yonetici ve OrtakOzellikler isimlerinde sınıflar oluşturduk.
Calisan ve Yonetici sınıfı OrtakOzellikler sınıfından extends ile kalıtım yapıyor.
Kalıtım ile alınan özellikler dışında her sınıfın kendine has fields’ları da var. Calisan sınıfının okul fields’ı, Yonetici sınıfının spor fields’ı ve projeBaslat metodu var.
Main.java içerisinde Calisan ve Yonetici nesnelerimizi oluşturuyoruz ve buralara parametre gönderiyoruz. Ortak fields’larla beraber kendine has fields’lar için de.
Calisan ve Yonetici sınıflarında constructor var. Bu şekilde parametreleri aldık. Ama bir sorun var.
Calisan ve Yonetici sınıfları OrtakOzellikler sınıfından kalıtım yaptığından paramtrelerin buradan da oraya gönderilmesi lazım. Bu işi super hallediyor.
super ile gelen parametrelerimizi OrtakOzellikler sınıfının içindeki constructor‘a gönderdik.
Kendine has olan fields’ı da this ile direkt olarak buradakine eşitliyoruz. Bir yere göndermiyoruz yani.
OrtakOzellikler sınıfına gelen parametreleri this ile buradaki fields’lara eşitledik ve yazdir metodunda bunların ekrana bastırılmaya hazır hale getirdik.
Main.java içerisinde hangi nesne için yazdir metodu çağrılırsa ona göre yazdırma işlemleri gerçekleşecek.
Yonetici sınıfının fazladan bir de projeBaslat isminde metodu vardı. Bunu da Main.java içerisinde parametre göndererek çağırdık
         */







    }
}
