package lesson3.localfieldinit;

public class BoxedPrimitive {
    public static void main(String[] args) {
        int x = 10; // Primitive , Local Variable
        // All BoxedPrimitives are Immutable
        Integer b = 20; // Boxed Primitive / Reference Type
        int cr = b.compareTo(12);
        System.out.println(cr);
        System.out.println(Integer.max(13, 15));
        Integer c = x; // Auto boxing - Converting primitive to Boxed is called Autoboxing

        String x1 = "12.45";
        // Convert the String input to double
        Double d = Double.parseDouble(x1);
        System.out.println(d);
     //   Float f=null;
        Float f=34.56f;
        System.out.println(f.toString());//Cause NPE if f == null
    }
}
