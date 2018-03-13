package raj;
// Super class
public class Vehicle {
    protected String companyName = "Toyota";
    private String location= "Florida";
    protected int establishedYr = 1989;

    protected void getLocation(){
        System.out.println(location);
    }
}
// Child class - Default
class Corolla extends Vehicle {
    void printCompanyName(){
        System.out.println(companyName);
    }
    void printEstablishedYr(){
        System.out.println(establishedYr);
    }
    public static void main(String[] args){
        Corolla corolla=new Corolla();
        corolla.printCompanyName();
        corolla.printEstablishedYr();
        corolla.getLocation();
    }
}