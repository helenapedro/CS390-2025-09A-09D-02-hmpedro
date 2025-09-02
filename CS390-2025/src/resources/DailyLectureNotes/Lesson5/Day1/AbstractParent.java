package lesson5;

public abstract class AbstractParent {
    // abstract class constructor cannot be private
    private  int key;
  abstract void test();
  abstract int add(int a,int b);
  public int sub(int a, int b){
      return a - b;
  }
}
