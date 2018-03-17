package Aishwarya;

public class AccessModifiers {
    public int i = 20;
    private int j = 30;
    protected int k = 45;
     public void add(int a,int b)
     {
      System.out.println(a+b);
     }
     private void hello()
     {
         System.out.println("Helloo");
     }
     void hi()
     {
         System.out.println("Hii");

     }

     protected void msg()
     {
         System.out.println(i);
     }
     public static void main(String[] args)
     {
         AccessModifiers a = new AccessModifiers();
         a.add(10,20);
         a.hello();
         a.hi();
         a.msg();
     }
}
