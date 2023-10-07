package SamplePrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String reverseString ="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString = reverseString + str.charAt(i);
		}
		if(str.equals(reverseString)) {
			System.out.println("Given String "+str+" is palindrome");
		}else
			System.out.println("Given String "+str+" is not a palindrome");

	}

}
