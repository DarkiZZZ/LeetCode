
public class PalindromeNumber {

	public static void main(String[] args) {
//		 #9 - Palindrome Number(Checking)
//		==================================
		System.out.print(isPalindrome(1222));
//		==================================

	}

	
//	 		#9 - Palindrome Number
//	==================================
	public static boolean isPalindrome(int x) {
		String numString = String.valueOf(x).toString();
		String reverseNumString =  new StringBuilder(numString).reverse().toString();
		if(numString.equals(reverseNumString)) {
			return true;
		}
		return false;
	}
//	==================================

}
