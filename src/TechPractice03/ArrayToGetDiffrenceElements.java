package TechPractice03;

public class ArrayToGetDiffrenceElements {

    public static void main(String[] args) {

        // To get untill last 2 elements
        int arra[] = {3, 1, 7, 9, 4, 23, 12, 78};

        for(int y =0; y<arra.length;y++) {

           if(y< arra.length-2) {
               continue;
           }
               System.out.print(arra[y]+" ");
        }

        System.out.println(); // For gap
        //To get first thhree elements
        for(int z =0; z<arra.length;z++) {

            if (z > 2) {
                break;
            }
            System.out.print(arra[z]+" ");
        }


        System.out.println(); // for gap
        // To get index 2 t0 4

        for(int v=0;v<arra.length;v++) {
            if (v < 2) {
                continue;
            }

            if (v > 4) {
                break;
            }
            System.out.print(arra[v]+" ");
        }

        }
 }
