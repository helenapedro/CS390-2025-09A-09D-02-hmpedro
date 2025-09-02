package lesson2;

public class TrickyCharIntConversion {
    public static void main(String[] args) {
        // Case 1: Implicit char to int conversion (Automatic)
        char ch = 'a';
        System.out.println("char=" + ch);
        // char to int narrow conversion and implicit
        int value = ch; // Char to int
        System.out.println("Value="+value);

        /* Case 2:
        1. implicit narrowing conversion from int to char is not allowed
        2. aval is not marked final, its value could potentially change
           during execution, and the compiler cannot assume that
           aval will always hold a value that fits in a char
         */
        int aval = 65;
       // char cval = aval; // Compilation error

        /* Case 3: Key Rule:
        An implicit narrowing conversion from int to char is allowed only if:
        a) The int value is a constant expression.
        b) The value is within the valid char range(0 to 65535).
         */
        char a_val = 97; // Rule a & b are fine: Take 97 as compile time constant
        //char out_range = 70000; // Rule b violated.
        // The compiler treats as constant expression
        final int aval1 = 65;
        char cval1 = aval1; // Key rule a and b applicable
    }
}
