package lesson5.day2.newinterfaces;
// JDK Implemented methods - default, static and private
public interface Calculator {
    // public abstract
    void test(String msg);
    // Add implemented methods using default
    default int add(int x, int y){
        return x + y;
    }
    default int sub(int x, int y){
        return x - y;
    }
    default double circleArea(double r){
        return getPI() * r * r;
    }
    // private methods can access inside interface only
    private double getPI(){
        return Math.PI;
    }
}
