package raj;

/*
 * Static methods can only access static methods/ variables.
 */

public class StaticExample {
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    int a = 10;
    int b = 20;
    static final int c = 50;
    
    public void add(){
        System.out.println(a+b+c);
    }

    public static void square(){
        /*
           + - addition
           - - subtraction
           * - multiplication
           / - division
           % - remainder
         */
        System.out.println(Math.pow(c,2));
    }

    public static void main(String[] args){
        StaticExample staticExample = new StaticExample();
        staticExample.a = 99;
        staticExample.b = 99;
        staticExample.add();
        System.out.println(staticExample.getA());
        System.out.println(staticExample.getB());

        StaticExample staticExample2 = new StaticExample();
        staticExample2.a = 199;
        staticExample2.b = 199;
        staticExample2.add();
        System.out.println(staticExample2.getA());
        System.out.println(staticExample2.getB());
    }
}

