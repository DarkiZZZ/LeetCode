
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.print(isPalindrome(1222));

	}
	
	public static boolean isPalindrome(int x) {
		String numString = String.valueOf(x).toString();
		String reverseNumString =  new StringBuilder(numString).reverse().toString();
		if(numString.equals(reverseNumString)) {
			return true;
		}
		return false;
	}

}
