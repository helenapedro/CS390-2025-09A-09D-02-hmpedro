package lesson5.day2;

public class Sup {
    private int x = 1;
    public static void main(String[] args) {
        Sup s = new Sub();
        // print 1, came from Sup due to private early binding
        System.out.println(s.x);
    }
}
