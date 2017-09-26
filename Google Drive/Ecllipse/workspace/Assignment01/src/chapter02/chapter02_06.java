package chapter02;

import java.util.Scanner;

public class chapter02_06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int sum;
		
		System.out.print("Enter a number between 0 and 1000: ");
		num = input.nextInt();
		
		sum = (num / 100) + (num % 100 / 10) + (num % 10);
		
		System.out.println("The sum of the digits is " + sum);
	}

}
