package raj;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
   Student information
    - id

    int student1Id = 22;
    int student2Id = 33;
    ... 10
    int stundent26Id = 327;
 */
public class ArrayExample {

    public void setStudentIds(int studentCount){
        int studentArray[] = new int[studentCount];

        for(int i=0;i<studentArray.length;i++){
            studentArray[i] = readValue("Enter student id of roll no:"+(i+1));
        }

        for(int temp:studentArray){
            System.out.print(temp+"\t");
        }
    }

    public int readValue(String msg){
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        do{
             try {
                 System.out.println(msg);
                 input = scanner.nextInt();
                 System.out.println("Reached");
                 break;
            }catch (InputMismatchException exp){
                 System.out.println("Please enter integer");
            }
        }while(true);
        return input;
    }

    public static void main(String[] args){
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.setStudentIds(arrayExample.readValue("Enter no of students:"));
    }
}
