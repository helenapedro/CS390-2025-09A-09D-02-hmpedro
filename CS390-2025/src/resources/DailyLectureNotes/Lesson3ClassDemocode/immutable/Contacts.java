package lesson3.immutable;

/** 
 * This is an example of an immutable class.
 * See the Lesson 3 slides for a list of characteristics
 */
public final class Contacts {

    private final String name;
    private final String mobile;

    public Contacts(String name, String mobile) {
    	//validate parameters
    	if(name == null || name.length() == 0) {
    		throw new IllegalArgumentException("Invalid input");
    	}
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }
    
    public String toString() {
    	return name + ": " + mobile;
    }
  
    public static void main(String[] args) {
		Contacts rec1 = new Contacts("John", "641-472-6666");
		Contacts rec2 = new Contacts("Anne", "641-919-2222");
		System.out.println("Name in record #1: " + rec1.getName());
		System.out.println("Record #1: "+rec1+"\nRecord #2: "+rec2);
	}  
}