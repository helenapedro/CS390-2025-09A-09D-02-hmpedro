package lesson5;

public class TestParantChild {
    public static void main(String[] args) {
        // You cannot create object for an anstract class
        //AbstractParent ob = new AbstractParent();
        AbstractParent ob = new ChildAbstract();
        // Parent p1 = new Parent();
       // Parent p2 = new Child();
       // Child p3 = new Child();

        // Collection
       // Child[] col1 = new Child[5];
      //  col1[0] = p1; // Can't assign Parent to Child
        // Ti fix this as well as acheive polymorphism always decalre as Parent type
       // Parent[] col2 = new Parent[5];
       // col2[0] = p1;
        //col2[1] = p2;
        //col2[2] = p3;


    }
}
