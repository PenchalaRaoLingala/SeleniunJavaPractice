package SamplePrograms;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {4,7,3,2,1,5,6,40};
        int arr2[] = {3,12,9,1,32,40,2};
        for(int i=0;i<arr1.length;i++) {
        	for(int j=0;j<arr2.length;j++) {
        		if(arr1[i]==arr2[j]) {
        			System.out.println(arr1[i]);
        		}
        	}
        }


	}

}
