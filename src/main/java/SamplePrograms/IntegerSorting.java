package SamplePrograms;

public class IntegerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int []{2,99,5,0,1,67,32,-99,-43,12,75};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending oder: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
