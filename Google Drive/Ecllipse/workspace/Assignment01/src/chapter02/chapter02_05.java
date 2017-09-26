package chapter02;

import java.util.Scanner;

public class chapter02_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double subtotal;
		double gratuityRate;
		double gratuity;
		double total;
		
		System.out.print("Enter the subtotla and a gratuity rate: ");
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		
		gratuity = subtotal * gratuityRate / 100;
		total = subtotal + gratuity;
		
		System.out.printf("The gratuity is $%.1f and total is $%.1f", gratuity, total);
		
	}
}
