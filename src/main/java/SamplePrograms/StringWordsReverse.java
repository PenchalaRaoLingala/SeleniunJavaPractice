package SamplePrograms;

public class StringWordsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to bangalore";
		String words[] = str.split(" ");
		System.out.println(words.length);
        String reverseString = "";
        for(int i=0; i<words.length; i++) {
        	String word = words[i];
        	String reverseWord="";
        	for(int j=word.length()-1;j>=0;j--) {
        		reverseWord = reverseWord + word.charAt(j);
        	}
        	reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
	}

}
