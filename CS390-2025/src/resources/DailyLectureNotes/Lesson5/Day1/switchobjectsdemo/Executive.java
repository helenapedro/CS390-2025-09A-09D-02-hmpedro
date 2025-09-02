package lesson5.switchobjectsdemo;

public class Executive extends Employee {
	public Executive(String name, double salary, int year, int month, int day,
			double bonus, int numShares) {
		super(name, salary, year, month, day);
		this.bonus = bonus;
		numCompanyShares = numShares;
		
	}
	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
		
	}
	public void setNumCompanyShares(int num) {
		numCompanyShares = num;
	}
	
	public int getNumCompanyShares() {
		return numCompanyShares;
	}

	private double bonus;
	private int numCompanyShares;
}
