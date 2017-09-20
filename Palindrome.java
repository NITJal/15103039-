import java.util.Scanner;

class Palindrome {

	String str;
	Scanner scan;

	void getValue() {

		scan = new Scanner(System.in);
		System.out.println("Check Palindrome String or not");
		System.out.println("\nEnter a String :");
		str = scan.nextLine();
	}

	void palindromeString() {
		boolean isPalindromeString = true;
		if (str == null) {
			isPalindromeString = false;
		} else {
			int length = str.length();
			for (int i = 0; i < length / 2; i++) {

				if (str.charAt(i) != str.charAt(length - i - 1))
					isPalindromeString = false;
			}
		}
		if (isPalindromeString)
			System.out.println(str + " is a Palindrome String");
		else
			System.out.println(str + " is a  not a Palindrome String");
	}

}
class MainClass {

	public static void main(String args[]) {

		Palindrome obj = new Palindrome();

		obj.getValue();
		obj.palindromeString();
	}
}