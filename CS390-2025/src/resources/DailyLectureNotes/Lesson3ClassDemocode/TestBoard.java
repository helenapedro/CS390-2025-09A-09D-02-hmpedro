package lesson3.day1;

public class TestBoard {
    public static void main(String[] args) {
        /* How to create an object?
         * Object means instance of a class/ Realization of class template
         * Constructor - Right side after new keyword, make use any one constructor
         * Classname ob = new Classname();
         * If you have no constructor at all, compiler add the
         * default constructor-No parameter
         */
        // Status of the object - The values currently hold by the object instance field
        // Status of b1 color = "White"; h = 45.5; w = 55.5;
        Board b1 = new Board();
        System.out.println(b1.area());
        System.out.println(b1.perimeter());
        System.out.println("b1 = " + b1);
        // Status of b11 color = "White"; h = 45.5; w = 55.5;
        Board b11 = new Board();
        b11.setColor("Grey");
        b11.setH(23.5);
        b11.setW(33.3);
        System.out.println(b11.getH() + ", " + b11.getW() + " for the area = " + b11.area());
        // To set the new vales to b11 instance fields, store - setters , to read - getters
        /*

         b1 and b11 having the same data. Can I say both are same ? (NO)
         Every object has its own identity, even the data are same
         */
        // Status of b1 color = "Black"; h = 67.8; w = 78.9;
        Board b2 = new Board("Black",67.8,78.9);
        System.out.println(b2.area());
        System.out.println(b2.perimeter());
        System.out.println(b2.toString());

        Board b3 = new Board(35,56);
        System.out.println(b3.area());
        System.out.println(b3.perimeter());

        System.out.println(b3);//Invoke toString from Board object

        // Creating an array of objects and processing. Way 1
        int[] nums = new int[3];
        Board[] boards = new Board[4];
        boards[0] = b1;
        boards[1] = b11;
        boards[2] = b2;
        boards[3] = b3;
        // Way -2
        Board[] col   = {b1,b11, new Board(),b2, b3};
        // Computer the average area of all the boards
        double sum = 0.0;
        for(Board b:boards){
            sum = sum + b.area();
        }
        double ave = sum / boards.length; // Not recommend sum / 4;
        System.out.println("Average of Board Collection :  " + ave);
        System.out.println("Average of Board Collection :  " + computeAverage(col));
        Board b4 = new Board();  // Garbage - Releasing
    }
    public static double computeAverage(Board[] c){
        double sum = 0.0;
        if(c.length>0 && c!=null) {
            for (Board b : c) {
                sum = sum + b.area();
            }
            double ave = sum / c.length; // Not recommend sum / 4;
            return ave;
        }
        return 0.0;
    }
}
