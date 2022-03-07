package Techday21VarArgsAccess;

public class Student extends Parent{


    public String name = "Ali Can";

    Integer age =12; // if you dont any DataType , ,t means the modifier is "default"
    //publis class members ( variable and methods )are accessible from entire the project
    //Note 3: "private" class members cannot be accessible from other classes and from other packages
    //        "private" class members can be accessible just from the class itself
    //Note 4: "default"(package private) class members cannot be accessible  from other packages
    //Note 5: "protected" class members can be accessible from child classes in any packages
    //        "protected" class members cannot be accessible from other packages if you are not child class
    //Note 6: A class cannot be "protected" and cannot be "private".
    //        "protected" and "private" access modifiers are just for class members not for classes.
    /*
        1)What is the difference between "public" and "default"(package private)?
        Answer: No restriction for "public" in entire the project.
                No restriction for "default" in entire the package.
        2)What is the difference between "protected" and "default"(package private)?
        Answer: No restriction for "protected" in child classes
                No restriction for "protected" in entire the package
                No restriction for "default" in entire the package

        3)What is the difference between "public" and "protected"?
        Answer: No restriction for "public" in entire the project.
                No restriction for "protected" in child classes
                No restriction for "protected" in entire the package
     */

}