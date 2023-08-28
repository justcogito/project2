package Part1.Syntax;
public class Task2 {
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

// Task 2. Demonstrate operations with Numbers.

        // Arithmetic operations:
        result_double = (int1 + double2 - arr1[0]) / (double2 * arr1[3]);
        System.out.println(result_double);

        // Rounding:
        result_int = (int) Math.round(result_double);
        System.out.println(result_int);

        // Modulus:
        result_int = arr1[1] % arr1[0];
        System.out.println(result_int);

    }
}
