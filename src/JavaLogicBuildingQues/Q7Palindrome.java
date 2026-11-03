package JavaLogicBuildingQues;

public class Q7Palindrome {

	public static void main(String[] args) {
		String original ="Madam";
		if(isPalindrome(original)) {
			System.out.println(original + " is a Palindrome");
		}else {
			System.out.println(original + " is not a Palindrome");
			throw new ExceptionHandling("******Invalid String for checking Palindrome***********");
		}

	}
	
	public static Boolean isPalindrome(String str) {
		str = str.replace(" ", "").toLowerCase();
		int left =0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
				left++;
				right--;
			
			
		}
		return true;
		
		
	}

}
