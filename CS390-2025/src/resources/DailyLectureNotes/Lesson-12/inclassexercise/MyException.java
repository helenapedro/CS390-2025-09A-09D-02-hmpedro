package lesson12.inclassexercise;

public class MyException extends  Exception{
    MyException(){
        super("Invalid Age");
    }
    MyException(int age){
        super(age + " is not negative");
    }
}
