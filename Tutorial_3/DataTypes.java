package Tutorial_3;

// Primitive Data Types
public class DataTypes {

    // use case: true/false
    static boolean boo1 = true;
    static boolean boo2 = false;

    // use case: save memory in large arrays where memory saving is important
    static byte byteMin = -128;
    static byte byteMax = 127;

    // use case: same as byte, but bigger values possible
    static short shortMin = -32768;
    static short shortMax = 23767;

    // use case: default data type for integral values
    static int intMin = -2147483648;
    static int intMax = 2147483647;

    // use case: need a range of values more than those provided by int
    static long longMin = -922337203685775808L;
    static long longMax = 922337203685775807L;

    // use case: need to save memory in large arrays of floating point numbers
    static float floatExample = 234.5f;

    // use case: value range unlimited (default data type for decimal values)
    static double doubleExample = 789.01;

    // use case: store characters
    static char charExample = 'A'; // Unicode System

    public static void main(String args[]) {
        System.out.println("One value of 'boolean' is: " + boo1);
        System.out.println("One value of 'boolean' is: " + boo2 + "\n");
        System.out.println("The lowest value of 'byte' is: " + byteMin);
        System.out.println("The highest value of 'byte' is: " + byteMax + "\n");
        System.out.println("The lowest value of 'short' is: " + shortMin);
        System.out.println("The highest value of 'short' is: " + shortMax + "\n");
        System.out.println("The lowest value of 'int' is: " + intMin);
        System.out.println("The highest value of 'int' is: " + intMax + "\n");
        System.out.println("The lowest value of 'long' is: " + longMin);
        System.out.println("The highest value of 'long' is: " + longMax + "\n");
        System.out.println("An Example of 'float' is: " + floatExample + "\n");
        System.out.println("An Example of 'double' is: " + doubleExample + "\n");
        System.out.println("An Example of 'char' is: " + charExample);

    }
}