package SamplePrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int sum=0, temp;
		temp=n;
		
		while(temp!=0) {
			int r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println(n+" is a Amstrong number");
		}else
			System.out.println(n+" is not a Amstrong number");

	}

}
