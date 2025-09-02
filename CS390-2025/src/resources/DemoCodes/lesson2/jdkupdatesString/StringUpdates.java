package lesson2.jdkupdatesString;

public class StringUpdates {
    public static void main(String[] args){
        // Text Block - JDK 15
        String rgb = """
               Red
               Green
               Blue
                """;
        System.out.println(rgb);

        String name = "Tom";
        int age = 30;
        String greeting = """
                  Hello, my name is %s and I am %d years old.
                  """.formatted(name, age);
        System.out.println(greeting);
    }
}
