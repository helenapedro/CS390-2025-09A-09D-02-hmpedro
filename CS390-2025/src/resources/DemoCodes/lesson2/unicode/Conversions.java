package lesson2.unicode;

public class Conversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c = 'A';
		int unicodeVal = (int)c;  // this is in base 10
		String hexVal = Integer.toHexString(unicodeVal); //value = 41
		System.out.println("unicode value for Character A is: \\u" + pad(hexVal));
		
		c = '终'; 
		unicodeVal = (int)c;  // this is in base 10
		hexVal = Integer.toHexString(unicodeVal); //value = 7ec8
		System.out.println("unicode value for Character 终 is: \\u" + pad(hexVal));
		
		String str = "\u7ec8";
		System.out.println("Character for unicode \u7ec8 is: " + str);
	}
	public static String pad(String hex) {
		while(hex.length() < 4) {
			hex = "0" + hex;
		}
		return hex;
	}

}
