package lesson2.unicode;

public class Unicode {

	/**
	 * @authour "Renuka"
	 * This program demonstrates about Unicode characters 
	 */
	public static void main(String[] args) {
		
		char c = 'K';
		char z = '\u7ec8';
		int AsVal = (int)c;  
		String hexVal = Integer.toHexString(AsVal); 
		System.out.println("Unicode Value :" + AsVal);
		System.out.println("Z = " + z);
		System.out.println("Hexa Decimal Value :" + hexVal);
		System.out.println("\u004b");
		String COPYRIGHT = "\u00a9";
		String REGISTERED = "\u00ae";
		String EURO = "\u20ac";
		System.out.println(COPYRIGHT + " "+REGISTERED + " "+EURO);
		// UTF-16LE/BE stands for Unicode Transformation Format - 16-bit Little Endian/Big Endian.
		
		// to print other language character click RunAs->Runconfiguration->Common tab->change console encoding UTF-8/16 
		String chineseString = "\u4e00\u4e01\u4e02\u4e03\u4304"; 
		System.out.println(chineseString);	
		// Refer http://www.ssec.wisc.edu/~tomw/java/unicode.html for other language characters
		String tamilString = "\u0B85\u0B86\u0B87\u0B88\u0B89"; 
		System.out.println(tamilString);
		
				System.out.println('\u1200');
				
				System.out.println("\ud835\udd6b");
			
				System.out.println("\"Hello\" \n next line");
		}

}
