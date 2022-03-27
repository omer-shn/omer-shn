package Classes;

public class Garden {


    String flowername ;
    String color ;
    int    leaf;

    public  Garden( String fl, String cl, int le) {

        this.flowername= fl; //Buradaki this class Garden daki flower ile eşitlemek için
     color=cl; // this keyword ünü color ve leaf için kullanmadık, bu sefer
     leaf=le; //GardenMain class'ından bilki getirir.
    }
}
