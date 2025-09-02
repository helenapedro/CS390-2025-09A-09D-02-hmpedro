package lesson2.commandline;

public class ParameterExample {

	public static void main(String[] args) {
		if (args.length ==0 || args == null) { //args is never null
			System.out.println("Empty Arguments");
		}
		// Immutable - Costly operation.
		String res= "";
		for (int i = 0; i < args.length ; ++i) {
			System.out.println("position " + i + ": " + args[i]);
		}
	}
}