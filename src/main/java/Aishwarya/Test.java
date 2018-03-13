package Aishwarya;

public class Test {
    // Global Variables
    int a = 10;
    int b = 20;

    // Default Constructor
    public Test() {
        System.out.println("First constructor");
    }

    // Parameterized Constructor
    public Test(int x, int y) {
        System.out.println(x + y);
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.add();
        t.add1();
        Test t1 = new Test(10, 20);
        Test t2 = new Test(40, 80);
    }

    public void add() {
        // Local Variables
        int a = 80;
        int b = 90;
        System.out.println(a + b);
    }

    public void add1() {
        // Adds Global Variables
        System.out.println(a + b);
    }
}


