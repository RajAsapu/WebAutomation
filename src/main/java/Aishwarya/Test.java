public class Test {
    int a =10;
    int b =20;

public Test()
{
    System.out.println("First constructor");
}
    public Test(int x,int y)
    {
        System.out.println(x+y);
        System.out.println(x*y);

    }
        public void add()
        {
            int a=80;
            int b=90;
            System.out.println(a + b);
    }

            public  void add1()
            {
                System.out.println(a + b);
            }
            public static void main(String[] args)
            {
        Test t = new Test();
        t.add();
        t.add1();
        Test t1 = new Test(10,20);
        Test t2 = new Test(40,80);
            }
        }


