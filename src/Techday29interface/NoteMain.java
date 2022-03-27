package Techday29interface;

public class NoteMain {
    public void addition(IFourOperate fr) {
        fr.addition();
    }
    public void subcrubtion(IFourOperate fr) {
        fr.subcrubtion();
    }
    public void multiplication(IFourOperate fr) {
        fr.multiplication();
    }
    public void division(IFourOperate fr) {
        fr.division();
    }
}
 class Fmain {

    public static void main(String[] args) {
        NoteMain dim =new NoteMain();

        dim.addition(new NoteVisa());
        dim.addition(new NoteFinal());
    }
}

