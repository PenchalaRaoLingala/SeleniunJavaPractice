package SamplePrograms;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {2,5,4,8,7,3,4,5,38,1,9,2};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			if(map.containsKey(key)) {
				int count = map.get(key);
				count++;
				map.put(key, count);
			}else {
				map.put(key, 1);
			}
		}
		for(Map.Entry<Integer, Integer> val : map.entrySet()) {
			System.out.println(val.getKey()+ " occures"+val.getValue()+" times");
		}
		

	}

}
