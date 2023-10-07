package SamplePrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int num = sc.nextInt();
		if(num%4==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap year");
		}
			

	}

}
