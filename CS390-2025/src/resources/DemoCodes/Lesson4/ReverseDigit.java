package lesson4;

public class ReverseDigit {
	public static void main(String[] args) {
		xMethod(1234567);
		System.out.println();
	}
	public static void xMethod(int n) {
		if (n > 0) {
		System.out.print(n % 10);
		xMethod(n / 10);
		}
		}
}
