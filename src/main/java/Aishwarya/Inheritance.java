package Aishwarya;

public class Inheritance {
     String name = "Fdu";
     String state = "nj";
     String course = "computer science";
     public void college() {
         System.out.println(name);
         System.out.println(state);
         System.out.println(course);
     }
}
    class Student extends Inheritance {

        public void details() {

             char grade = 'A';
             System.out.println(grade);
        }


    public static void main(String[] args) {
        Student s = new Student();

        s.details();
        s.college();
    }


}