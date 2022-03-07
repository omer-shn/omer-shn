package Classes;

public class Mphone {

    String marka;
    String model;
    int memory;
    int ram;
    double camera;


    public Mphone(String marka,String model,int memory, int ram, double camera) {

        this.marka=marka;
        this.model=model;
        this.memory=memory;
        this.ram=ram;
        this.camera=camera;
    }

    public void show()
    {
        System.out.println("Telefon markası : "+this.marka);
        System.out.println("Telefon modeli : "+this.model);
        System.out.println("Telefon ram'i : "+this.memory);
        System.out.println("Telefon hafızası : "+this.ram);
        System.out.println("Telefon kamerası : "+this.camera);
    }
}
