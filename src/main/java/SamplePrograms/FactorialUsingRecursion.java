package SamplePrograms;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact = 1;
		int number = 5;
		fact = factorial(number);
		System.out.println("Factorial of "+number+" is: "+fact);   
	}

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}else {
			return (n*factorial(n-1));
		}
	}
}
