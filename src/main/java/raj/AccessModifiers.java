package raj;

/*
 * Public - Can be accessed from any where ( Inside and Outside Package)
 * Private - Can be accessed only from inside the class
 * Protected
 * Default - Behaves as public inside the package and private outside the package
 *
 */
public class AccessModifiers {
    private String sayHello = "Hello!";

   public void printMsg(){
        System.out.println(sayHello);
    }

    private void modify(){
        sayHello = "Private Variable";
    }
}
