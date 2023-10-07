package SamplePrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1112234235;
		Set<Integer> set = new HashSet<Integer>();
		while (number > 0) {
			int r = number % 10;
			number = number / 10;
			set.add(r);
		}
		StringBuilder sb = new StringBuilder();
		for(Integer in : set) {
			sb.append(in);
		}
		System.out.println(sb.toString());
	}
}
