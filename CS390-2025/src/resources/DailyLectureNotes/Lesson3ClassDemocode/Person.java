package lesson3.day1;

public class Person {
   // var String fname; // Cannot use var for instance field
    private String fname;
    private String lname;
    private int count = 0;

    public Person(String fname, String lname) {
       // Person("Tom","Bruce"); // Self call constructor not allowed
        count++;
        this.fname = fname;
        this.lname = lname;
    }

    public  int getCount() {
        return count;
    }
}

