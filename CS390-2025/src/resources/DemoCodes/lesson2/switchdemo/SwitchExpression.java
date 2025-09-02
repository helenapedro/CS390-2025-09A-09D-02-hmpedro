package lesson2.switchdemo;

public class SwitchExpression {
    public static void main(String[] args){
        var w = 145.6;
        double weight=0.0;
        String p = "venus";
        p = p.toLowerCase();
        // 1. Regular Switch
        switch (p){
            case "venus": weight = w * 0.78;
                break;
            case "mars": weight = w * 0.39;
                break;
            case "jupiter": weight = w * 2.65;
                break;
            case "saturn": weight = w * 1.17;
                break;
            case "uranus": weight = w * 1.05;
                break;
            case "neptune": weight = w * 1.23;
                break;
            default:
                System.out.println("Wrong choice");
        }
        System.out.println("Regular switch");
        System.out.println("Your weight is in the planet " + p + " is = " + weight);
   // 2. Replace it with new Switch without a break
        switch (p) {
            case "venus" -> weight = w * 0.78;
            case "mars" -> weight = w * 0.39;
            case "jupiter" -> weight = w * 2.65;
            case "saturn" -> weight = w * 1.17;
            case "uranus" -> weight = w * 1.05;
            case "neptune" -> weight = w * 1.23;
            default -> System.out.println("Wrong choice");
        }
        System.out.println("Enhanced  switch");
        System.out.println("Your weight is in the planet " + p + " is = " + weight);
    // 3. Switch Expression - Return the result
       weight =  switch (p) {
            case "venus" ->  w * 0.78;
            case "mars" ->  w * 0.39;
            case "jupiter" ->  w * 2.65;
            case "saturn" ->  w * 1.17;
            case "uranus" ->  w * 1.05;
            case "neptune" ->  w * 1.23;
            default -> 0.0;
        }; // End the statement with semicolon
        System.out.println("Switch Expression");
        System.out.println("Your weight is in the planet " + p + " is = " + weight);
        // 4. Switch and Yield in a block
        System.out.println("Switch and yield");
        String n = null;
        weight =  switch (p) {
            case "venus" : {
                    System.out.println("You are in the Venus ");
                    yield w * 0.78;
            }
            case "mars" : {
                System.out.println("You are in the Mars ");
                yield  w * 0.39;
            }
            case "jupiter" :{
                System.out.println("You are in the Jupiter ");
                yield w * 2.65;
            }
            case "saturn" : {
                System.out.println("You are in the Saturn ");
                yield  w * 1.17;
            }
            case "uranus" : {
                System.out.println("You are in the Uranus ");
                yield w * 1.05;
            }
            case "neptune" : {
                System.out.println("You are in the Neptune ");
                yield  w * 1.23;
            }
           case null : yield 120.0; // Avoid NullPointerException
            default : yield 0.0;
        };
        System.out.println("Your weight is in the planet " + p + " is = " + weight);
    }
}
