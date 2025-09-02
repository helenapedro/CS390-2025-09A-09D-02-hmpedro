package lesson5.day2.newinterfaces;

public class MyCalculator implements Calculator{
    @Override
    public void test(String msg) {
        System.out.println("Hello " + msg);
    }
    @Override
    // You can override the default behavior
   public  int add(int x, int y){
        return x + y + 5;
    }
}
