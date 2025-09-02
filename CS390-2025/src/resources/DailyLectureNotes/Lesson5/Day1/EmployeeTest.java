package lesson5;

public class EmployeeTest {
	public static void main(String[] args) {
	Employee e1 = new Employee(); // Default constructor
		Employee e2 = new Employee("Tom",4500.66,2000,12,20);
		Employee m1 = new Manager("Brook",4500.66,2010,12,10);
		// To access setBonus through m1, need a downcasting
		((Manager) m1).setBonus(1000); // You need inheritance relationship
		// e2 is type of Employee cannot access setBonus, Parent cannot access child behaviours
		// can m1 access setBonus() - No, It's compile type is Employee, a Manager type is determined at runtime

		Manager boss = new Manager("Tommy",5500.66,2010,12,10);
		boss.setBonus(1000);
		 Employee[] coll = new Employee[3];
		 coll[0] = m1;
		 coll[1] = boss;
		 coll[2] = e2;
		 // Loop through a collection and print the salary
		for(Employee e: coll){
			System.out.println("Name " + e.getName());
			// The 0, 1 position getSalary comes from a runtime type of Manager
			// The 2 position getSalary comes from a runtime type of Employee
			System.out.println("Salary = " + e.getSalary()); // Dynammic binding happen
			double sum_Salary = printTotal(coll);
			System.out.println("Total Salary = " + sum_Salary);

			// Checking the Runtime Type using instance of
			String x = "Java";
			System.out.println(x instanceof Object);
			System.out.println(x instanceof String);
			System.out.println(e1 instanceof Manager);
			System.out.println(boss instanceof Employee);
			System.out.println(boss instanceof Manager);


		}
	}
	// Return total salary of all the employee, do null check to avoid runtime error
	public static double printTotal(Employee[] arr) {
		if(arr==null || arr.length==0)
			return 0.0;
		double tot = 0.0;
		for(Employee e: arr){
			tot+=e.getSalary();
		}
		return tot;
	}
	// Method expects an Employee type, I can pass a Manager type. It's LSP
	public static void myPrint(Employee e){

	}
	// Method ca accept all Boxed Primitives
	public static void myNumber(Number n){

	}

}
