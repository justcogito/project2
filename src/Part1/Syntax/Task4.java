package Part1.Syntax;

import java.time.Year;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

// Task 1. Use variables of different types (int, double, char, boolean, String).

// declaring variables:

        int int1 = 2501, int2 = 1052, result_int;
        double double1 = 25.01, double2 = 10.52, result_double;
        char char1 = 'a', char2 = 'b', result_char;
        boolean bool1 = true, bool2 = false, result_bool;
        String str1 = "'Hello there!'", str2 = "'Ah, general Kenobi!'", result_string;
        int[] arr1 = {2, 5, 0, 1};

/*
* We should uncomment this part
* to demonstrate output, then
* we should comment it again
* to keep it out the way
*
        // printing some variables:
        System.out.println(int1);
        System.out.println(double1);
        System.out.println(char1);
        System.out.println(bool1);
        System.out.println(str1);
        System.out.println(arr1[2]);
*/

// Task 4. Demonstrate Input/Output operations.

        Scanner in = new Scanner(System.in);

        // Asking for the current year:
        System.out.println("Hey, do you know what year is it?");
        result_int = Integer.parseInt(in.nextLine());
        System.out.println(result_int == Year.now().getValue() ? "You are right!" : "Nah, you are wrong.");

        // Writing something in console then printing:
        result_string = in.nextLine() + str1 + " ... " + str2 + in.nextLine();
        System.out.println(result_string);

    }
}
