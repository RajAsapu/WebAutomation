package raj;

public class Accessor {
    public static void main(String[] args){
        AccessModifiers accessModifiers=new AccessModifiers();
        accessModifiers.printMsg();

        Vehicle vehicle=new Vehicle();
        vehicle.getLocation();

        Corolla corolla = new Corolla();
        corolla.getLocation();
        corolla.printEstablishedYr();
        corolla.printCompanyName();
    }
}
