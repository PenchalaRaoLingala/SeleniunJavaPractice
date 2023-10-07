package SamplePrograms;

public class OccuranceoflargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 14,46,47,86,92,85,99,92,92,54,92 };
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(secondLargest == arr[i]){
				count++;
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
		System.out.println("Number of Occurance of " + secondLargest + ":" + count + " times");


	}

}
