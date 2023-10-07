package SamplePrograms;


public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =2121;
		int sum=0, temp;
		temp=n;
		
		while(temp>0) {
			int r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		if(sum == n) {
			System.out.println(n+ " is a palindrome Number");
		}else
		{
			System.out.println(n+ " is not a palindrome number");
		}
 
	}

}
