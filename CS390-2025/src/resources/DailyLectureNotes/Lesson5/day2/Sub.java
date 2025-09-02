package lesson5.day2;

public class Sub extends Sup{
    int x = 2;
    public static void main(String[] args) {
        Sup s = new Sub();
        // Private visibility and early binding cannot access Sup x
      // int x = s.x;

    }
}
