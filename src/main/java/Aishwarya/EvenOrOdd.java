package Aishwarya;
import java.util.Scanner;
import java.lang.*;

public class EvenOrOdd{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no:");
        int no = s.nextInt();
        if(no%2 == 0)
        {
            System.out.println("Given no is even");
        }
        else
        {
            System.out.println("Given no is odd");
        }
    }



}


