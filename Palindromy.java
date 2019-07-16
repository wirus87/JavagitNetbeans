
public class Palindromy {
	public static void main(String[] args) {
		Palindromy pal= new Palindromy();
		
		System.out.println(pal.checkPalindrome("basdasd"));
		System.out.println(pal.checkPalindrome("basdsab"));
	}
	
	
	public boolean checkPalindrome(String inputString) {
	    int length = inputString.length();
	    
	    if (length < 2) return true;
	    else return inputString.charAt(0) != inputString.charAt(length - 1) ? false :
	            checkPalindrome(inputString.substring(1, length - 1));
	}
}
