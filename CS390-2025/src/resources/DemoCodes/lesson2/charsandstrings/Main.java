package lesson2.charsandstrings;


public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char a = 'A';
		char a1 = '\u0041';
		char a2 = 65;
		System.out.println("Answer : " + a + " " + a1 + " " + a2);
		System.out.println((char)65);
		System.out.println('\u0041');
		//if this doesn't print correctly,
		//Eclipse -change window>preferences>workspace>text encoding to UTF-8
		// IntelliJ - Go to File -> File Properties -> File Encoding to UTF-8
		System.out.println('\u7ec8');
		System.out.println("\ud835\udd6b_\ud835\udd6b"); //'\ud835\udd6b' is illegal
		System.out.println(Integer.toHexString((int)'终'));
		//System.out.println(Integer.toHexString(Character.toCodePoint('\ud835','\udd6b')));
		// Emojis Link : https://www.javatips.net/api/wire-android-master/wire-core/src/main/java/com/waz/zclient/utils/Emojis.java
		System.out.println( "\ud83c\udfbf");
		
	}

}
