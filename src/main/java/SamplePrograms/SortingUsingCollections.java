package SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer arr[] = {2,99,5,0,1,67,32,-99,-43,12,75};
		//List<Integer> list = Arrays.asList(arr);
		
		Character arr[] = {'D','H','A','F','G','B','E','C'};
		List<Character> list = Arrays.asList(arr);
		
		Collections.sort(list);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
