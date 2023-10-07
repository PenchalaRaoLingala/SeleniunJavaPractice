package SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//covert array of Strings into list 
		String[] words = {"Love Yourself"  , "Alive is Awesome" , "Be in present"};
		List list = Arrays.asList(words);
		System.out.println(list);
		
		//Reverse the list in collections
		Collections.reverse(list);
		System.out.println(list);

	}

}
