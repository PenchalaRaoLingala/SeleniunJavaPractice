package SamplePrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removingDupnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,1,1,2,2,2,3,3,4,4,4,4};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
