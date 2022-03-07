package Techday11DoWhile;

                             // GENEL YAPI
public class Constructors00GENEL {

// Create a Main class

    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public Constructors00GENEL() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Constructors00GENEL myObj = new Constructors00GENEL(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}



