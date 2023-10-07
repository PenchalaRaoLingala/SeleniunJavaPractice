package SamplePrograms;

public class CharecterSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1n#8h*df3g!d@986egeb}$";
		StringBuilder alphabets=new StringBuilder();
		StringBuilder digits=new StringBuilder();
		StringBuilder specialChars=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				digits.append(ch);
			}else if(Character.isAlphabetic(ch)) {
				alphabets.append(ch);
			}else {
				specialChars.append(ch);
			}
		}
		System.out.println("Alphabets in a String : "+alphabets);
		System.out.println("Digits in a String : "+digits);
		System.out.println("Special Chars in a String : "+specialChars);

	}

}
