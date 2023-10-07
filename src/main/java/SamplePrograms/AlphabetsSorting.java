package SamplePrograms;

public class AlphabetsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a = new char[] {'D','H','A','F','G','B','E','C'};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=(char)temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
