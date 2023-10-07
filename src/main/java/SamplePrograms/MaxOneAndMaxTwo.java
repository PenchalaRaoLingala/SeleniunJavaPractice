package SamplePrograms;

public class MaxOneAndMaxTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,89,0,65,78,90};
		int maxOne=arr[0];
		int maxTwo=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxOne) {
				maxTwo=maxOne;
				maxOne=arr[i];
			}else if(arr[i]>maxTwo) {
				maxTwo=arr[i];
			}
		}
		System.out.println("Largest Number "+maxOne);
		System.out.println("Second largest Number "+maxTwo);
	}

}
