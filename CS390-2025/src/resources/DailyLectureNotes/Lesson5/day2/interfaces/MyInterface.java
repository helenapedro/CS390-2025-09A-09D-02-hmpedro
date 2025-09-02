package lesson5.day2.interfaces;
// In FPP, we focused on Unimplemented methods are by default abstract
// In MPP, will focus on Implemented methods default, static and private

public interface MyInterface {
    // Inside, you can have abstract methods and fields
    int x = 20; // equivalent to public static final int x = 20;
   // double INT_RATE; // Error, must initialize the value
   double INT_RATE = 3.5; // By default it is public static final

    // By default all unimplemented methods are public abstract
    int add(int a,int b); // Default Signature is public abstract
    public abstract int sub(int a, int b);

    // MPP Knowledge use default / static
   default  int mul(int a, int b ){
        return a*b;
    }
}
