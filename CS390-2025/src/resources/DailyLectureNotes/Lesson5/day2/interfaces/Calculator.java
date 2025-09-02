package lesson5.day2.interfaces;
// Pre JDK 8
// This is a Functional Interface, SAM - Single Abstract Method
@FunctionalInterface
public interface Calculator {
    String concat(String a, String b);
}
