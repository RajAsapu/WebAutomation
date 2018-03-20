package raj;

/*

 */
public class OverloadingAndOverriding {
    public void print(){
        System.out.println("Method from Super class");
    }
}

class ChildOverloaded extends OverloadingAndOverriding {
    public void print(){
        System.out.println("Method from Child class");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(float a, float b){
        System.out.println(a+b);
    }

    public void  add(String x,String y){
        System.out.println(x+y);
    }
    public static void main(String[] args){
        ChildOverloaded child = new ChildOverloaded();
        child.print();
        child.add(20,30);
        child.add(30.22f,42.55f);
        child.add("Text","book");

    }
}