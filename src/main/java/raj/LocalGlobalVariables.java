package raj;

public class LocalGlobalVariables {
    /*
       Variables and methods
       Local variables gets priority over Global variables
       Global variables will be defined at the class level
     */
    // Global Variables
    int a;
    int b ;

    public LocalGlobalVariables(){
        a = 100;
        b = 200;
    }

    public void add(){
        System.out.println(a+b);
    }

    public void add2(){
        // Local variables
        int a = 300;
        int b = 400;

        System.out.println(a+b);
    }

    public static void main(String[] args){
        LocalGlobalVariables globalVariables = new LocalGlobalVariables();
        globalVariables.add2();
        globalVariables.add();

    }
}
