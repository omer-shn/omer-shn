package Techday25overriding;

public class CreditCard {

    private String ccn ="234543589765335";

    public String getCcn() { // getter methods only to read the value of encapsulated data from other classes
        return ccn; // Return type of getter() methods must be same with the data type of the variables
                    //Return type os setter () methods will be "void1" everytime.
    }

    public void setCcn(String ccn) { // setter methods makes update the value of encapsulated data from other classes
        this.ccn = ccn;
    }
}
