package lesson12.inclassexercise;

public class Main {
    String s = "hello";
    StringBuilder t = new StringBuilder("goodbye");
    public static void main(String[] args) {
        Main m = new Main();
        //m.stackOverflow();
        m.outOfMemory();
        m.outOfMemoryStringBuilder();

    }

    public int stackOverflow() {
        return stackOverflow() + 1;
    }
    public void outOfMemory() {
        long before = System.currentTimeMillis();
        for(int i = 0; i < 25; ++i) {
            s = dbl(s);
        }
        long after = System.currentTimeMillis();
        System.out.println((after-before));
    }
    private String dbl(String s) {
        return s + s;
    }

    public void outOfMemoryStringBuilder() {
        long before = System.currentTimeMillis();
        for(int i = 0; i < 25; ++i) {
            t.append(t);
        }
        long after = System.currentTimeMillis();
        System.out.println((after-before));
    }

}

