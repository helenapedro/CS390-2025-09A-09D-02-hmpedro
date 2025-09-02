package lesson3.immutable;

public record ContactsRecord(String name, String mobile) {
	     //implicit final private instance variables
		//    final private String name;
		//    final private String mobile;
		//implicit accessor methods
		//    public String name();
		//    public String mobile();
		
		/** input validation code using compact constructor 
		 *   (executes before the implicit constructor)
		 */
		public ContactsRecord {
			if(name == null || name.length() == 0) {
				throw new IllegalArgumentException("Invalid input");
			}
		}
		//implicit public constructor
		//    public ContactsRecord(String name, String mobile) {
		//        this.name = name;
		//        this.mobile = mobile;
		//    }
		//  
		
		//toString method has been implicitly overridden

	public static void main(String[] args) {
		ContactsRecord rec1 = new ContactsRecord("John", "641-472-6666");
		ContactsRecord rec2 = new ContactsRecord("Anne", "641-919-2222");
		System.out.println("Name in record #1: " + rec1.name());
		System.out.println("Record #1: "+rec1+"\nRecord #2: "+rec2);
	}
}
