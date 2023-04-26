package stringuppercase;

public class StringUpperCaseMethods {
	public static void main(String[] args) {
		String name = "SUMIT";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		// ----------------\\
		int a = 10;
		String s = String.valueOf(a);// value of is a static method that's why we call it via the string class
		System.out.println(s);
	}
}
