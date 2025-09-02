package lesson2.switchdemo;

public class TestSwitch {
    public static void main(String[] args) {
        var w = 145.6;
        String p = "venus";
        double weight=0.0;
        p = p.toLowerCase();
        switch (p) {
            case "venus" -> {
                System.out.println("Venus planet");
                weight = w * 0.78;
            }
            case "mars" -> {
                System.out.println("Mars mars");
                weight = w * 0.39;
            }
            case "jupiter" -> {
                System.out.println("Jupiter");
                weight = w * 2.65;
            }
            case "saturn" -> {
                System.out.println("Saturn");
                weight = w * 1.17;
            }
            case "uranus" -> {
                System.out.println("Uranus");
                weight = w * 1.05;
            }
            case "neptune" -> {
                System.out.println("Neptune");
                weight = w * 1.23;
            }
            default ->
                    System.out.println("Wrong choice");
        }
        System.out.println("Your weight is in the planet " + p + " is = " + weight);
    }
}
