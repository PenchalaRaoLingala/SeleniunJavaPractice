package SamplePrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDupChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aabbccdefaafaz";
		char[] ch=str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(char c : ch) {
			set.add(c);
		}
		System.out.println(set);
		StringBuilder sb = new StringBuilder(); 
		for(Character charcter : set) {
			sb.append(charcter); 
		}
		System.out.println(sb.toString() );
	}
}
