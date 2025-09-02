import java.util.Arrays;

public class ArraysDemo {
     public static void main(String[] args) {
          String input = "Hello, strings can be fun. They have many uses.";
          String[] result = input.split(",| |\\. |\\.");
          System.out.println(Arrays.toString(result));
     }
}
