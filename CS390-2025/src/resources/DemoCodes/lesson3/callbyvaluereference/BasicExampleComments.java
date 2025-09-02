package lesson3.callbyvaluereference;

public class BasicExampleComments {
	//Employee emp = new Employee("Alice","Thompson", 60000, 1995, 2, 10);
	public static void main(String[] args) {
		Employee emp = new Employee("Alice","Thompson", 60000, 1995, 2, 10);
		BasicExampleComments be = new BasicExampleComments();
		//Can update the object referenced by emp by calling methods or
		//accessing variables directly using dot notation
		System.out.println("Before Raise = " + emp.getSalary());
		be.raiseSalary(emp, 0.20);  //emp's salary has been raised
		System.out.println("After Raise = " + emp.getSalary());
		//Cannot change the reference stored in emp with a method call
		be.tryToChangeReference(emp);  //emp points to the same object as before
		System.out.println("After trytoChangeReference = " + emp.getSalary());
	}
	private void raiseSalary(Employee e, double percent) {
		e.raiseSalary(percent);
	}
	private void tryToChangeReference(Employee e) {
		//Variable e is destroyed after method exits; no change 
		//of reference in the emp variable occurs
		e = new Employee("Bob","Rogers", 70000, 1997, 10, 1);
	}
}
