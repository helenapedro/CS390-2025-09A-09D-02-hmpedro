package lesson12.inclassexercise;

public class TestExceptions {
    public static void main(String[] args) {
        int x = 10;
        int a = 10;
        if(a!=0)
          System.out.println(x/a); // Exception Object
        getData(5);
        System.out.println("End of Program");

    }
    public static void getData(int x){
        if(x<0)
            System.out.println("Stop");
       else
        getData(x-1); // Gives StackOverFlowError object
    }
}
