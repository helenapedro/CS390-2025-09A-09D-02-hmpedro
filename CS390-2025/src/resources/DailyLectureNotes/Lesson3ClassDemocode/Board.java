package lesson3.day1;
// keyword class Class_name
// Declare your top level class using only public or default
// Class - Blueprint/ template.
// Encapsulation: data and methods - Information hiding, security
// Keep data as private and behaviours as public
public class Board {
    // Fields, Instance fields, data member, attributes, properties
    private String color;
    private double h;// height
    private double w;//weight
    // Constructors to create an object, initialize the data members
    /* Initialize the data members.
     * Constructor has the same name of class name
     * Constructor can take arguments
     * Constructor does not have return type
     * You cannot call the constructor itself
     * You can call another constructor using this
     */
    // Default Constructor - Parameter free
    /*
     * int, short,long, byte -->0
     * float, double -->0.0
     * object --> null
     * boolean --> false
     * char-->Empty char
     */
    // Methods - Providing services through the object
    public Board(){
        // 1. Go with Default
       /* color = null;
        h = 0.0;
        w = 0.0;*/
        color = "White";
        h = 45.5;
        w = 55.5;

    }
    // Parameter Constructor
    public Board(String c, double ht, double wid){
        color = c;
        h = ht;
        w = wid;
    }
  /*  public Board(double h, double w){
        // h = h; --> both h are arguments from the constructor not instance field
        // To overcome the above use this keyword
        // this means belongs to the current instance
        this.color = "White";
        this.h = h;
        this.w = w;
    }*/

// It works in the same class.
    // Can use to call instance fields, methods and constructors
    // Constructor call should be the first line

    public Board(double h, double w){
        //System.out.println("This Constructor 3"); // Cause Compilation error
        this("White",h,w); // Should be the first line


    }
    public double area(){
        return h * w;
    }
    public double perimeter(){
        double p = 2 * (h + w);
      //  this.area(); // Calling method using this
        return p;
    }
    // To print the current status of your object override toString() - Object class
    public String toString(){
        return STR."""
Board Status =
Color = \{color}
 Height = \{h}
 Width = \{w}""";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}

