package raj;
/*
package
imports
<AccessSpecifier> class <className> {
   <Scope of the class>
}
public class
{
   variables
   methods (main Optional)
}
Syntax for method
------------------
<AccessSpecifier> <ReturnType> methodName(Parameters){
        <Code>
}
JVM -> CReates a memory space for string -> msg = Hello World
Syntax to create an Object
----------------------------
<className> objectName = new <className>

--------objectName-------------- 50KB
msg
-------------
Hello World!!
-------------

------------------------

 */
public class ObjectExample {
    public String msg;

    public ObjectExample(String initMsg){
        msg = initMsg;
    }


    public void sayHello() {
        System.out.println(msg);
    }

    public static void main(String[] args){
        ObjectExample obj = new ObjectExample("Hello World!!");
        obj.sayHello();
        ObjectExample obj2 = new ObjectExample("Hey !!");
        obj2.sayHello();
        ObjectExample obj3 = new ObjectExample("Good morning!!");
        obj3.sayHello();
        ObjectExample obj4 = new ObjectExample("Good Evening!!");
        obj4.sayHello();
        ObjectExample obj5 = new ObjectExample("Good Afternoon!!");
        obj5.sayHello();
        ObjectExample obj6 = new ObjectExample("Object Memory !!");
        obj6.sayHello();
    }
}
