package Part1.Syntax;
public class Task3 {
    public static void main(String[] args) {

// Task 1. Use variables of different types (int, double, char, boolean, String).

// declaring variables:

        int int1 = 2501, int2 = 1052, result_int;
        double double1 = 25.01, double2 = 10.52, result_double;
        char char1 = 'a', char2 = 'b', result_char;
        boolean bool1 = true, bool2 = false, result_bool;
        String str1 = "Hello there!", str2 = "HeLlO ThErE!", result_string;
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

// Task 3. Demonstrate String operations.

        // Concatenation:
        result_string = char1 + "__ " + str1 + " ... " + str2 + " __" + char2;
        System.out.println(result_string);

        // Getting string length:
        result_int = result_string.length();
        System.out.println(result_int);

        // Primitive char concatenation and comparison:
        result_bool = char1 + char2 == char1 + char2;
        System.out.println(result_bool);

        // Comparing strings ignoring case:
        result_int = str1.compareToIgnoreCase(str2);
        System.out.println(result_int == 0 ? true : false);

    }
}
