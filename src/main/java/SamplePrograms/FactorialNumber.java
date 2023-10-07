package SamplePrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int factorial = n;
		for(int i=n-1;i>1;i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of given number is: "+factorial);

	}

}
