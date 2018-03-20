package raj;

import java.util.Scanner;

public class SuperKeyword {
    String title = null;

    public SuperKeyword(){}
    public SuperKeyword(String title){
        this.title = title;
    }
}

class Child extends SuperKeyword {
    String title = null;

    public Child(){}
    public Child(String title){
        super(title);
        this.title = title;
    }

    public void printTitle(){
        System.out.println("Child Object->"+this.title);
        System.out.println("Super class Object->"+super.title);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a msg");
        Child child=new Child(scanner.next());
        child.printTitle();
    }
}
