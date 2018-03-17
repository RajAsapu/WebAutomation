package Aishwarya;

public class Accessor {
    public static void main(String[] args)
    {
        AccessModifiers a = new AccessModifiers();
        a.add(10,20);
        //a.hello(); Cannot be accesses because it is declared as private
        a.hi(); //  void by default is public, can be accessed within the package
        a.msg(); // Can be accessed because it is declared as protected and it can be accessed within the package
    }
}
