package raj;

/*
  short a = 20;  // 2 bytes - 16 bits
  int b = 40; // 4 bytes - 32 bits
  b = a;
 */
public class TypeCasting {
    // implicit casting
    short a = 20;
    int b=30;

    public void implicitCast(){
        b = a;
        System.out.println(b);
    }
    // Explicit Casting
    public void explicitCast(){
        a = (short) b;
        System.out.println(a);
    }

    public static void main(String[] args){
        TypeCasting typeCasting=new TypeCasting();
        typeCasting.implicitCast();
        typeCasting.explicitCast();
    }
}

