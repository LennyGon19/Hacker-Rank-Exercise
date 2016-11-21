import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integer values for a0,a1,a2");
        int a0 = input.nextInt();
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        System.out.println("Enter 3 integer values for b0,b1,b2");
        int b0 = input.nextInt();
        int b1 = input.nextInt();
        int b2 = input.nextInt();
        int a = 0;
        int b = 0;

        if(a0 > b0) {a++;}

        else if(a0 < b0){b++;}

        if (a1 > b1) {a++;}

        else if (a1 < b1) {b++;}

        if (a2 > b2) {a++;}

        else if (a2 < b2) {b++;}

        System.out.println(a + " " + b);

    }
}
