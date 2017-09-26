package chapter02;

import java.util.Scanner;

public class chapter02_07 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int min;
		int minInDays;
		int years;
		int days;
		
		System.out.print("Enter the number of minutes: ");
		min = input.nextInt();
		
		minInDays = min / 60 / 24;
		years = minInDays / 365;
		days = minInDays % 365;
		
		System.out.printf("%d minutes is approximately %d years and %d days", min, years, days);
	}

}
