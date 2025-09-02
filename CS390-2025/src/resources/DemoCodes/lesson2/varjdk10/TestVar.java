package lesson2.varjdk10;

public class TestVar {
    public static void main(String args[]){
        int x = 10;
        // Local variables are declared inside a method.
        var y = 10; // Infer int automatically
        // cannot reassign another type of values cause error
       // y = 12.5;
        var name = "Anonymous"; // Infer as a String automatically
        System.out.println("length = " + name.length());
        var sum=0;
        for (var counter = 0; counter < 10; counter++)
           sum+=counter;
        System.out.println("Sum = " + sum);
    }
}
