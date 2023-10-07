package SamplePrograms;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[]{2,5,99,0,65,78,98};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest Number "+largest);
		System.out.println("Smallest Number "+smallest);
	}

}
