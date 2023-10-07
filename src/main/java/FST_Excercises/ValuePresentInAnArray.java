package FST_Excercises;

import java.util.Arrays;

//Write a java program to check if a value is present in an Array
public class ValuePresentInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = {2,99,5,0,1,67,32,-99,-43,12,75};
		int toCheckValue = -99;
		boolean test = Arrays.asList(a).contains(toCheckValue);
		System.out.println(test);
	}

}
