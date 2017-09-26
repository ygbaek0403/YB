package chapter02;

import java.util.Scanner;

public class chapter02_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long time = System.currentTimeMillis();
		long remainder = time % (1000 * 60 * 60 * 24);
		long hour = remainder / (1000 * 60 * 60);
		long min = remainder % (1000 * 60 * 60) / (1000 * 60);
		long sec = remainder / 1000 % 60;
		long offset;
	
		System.out.print("Enter the time zone offset to GMT: ");
		offset = input.nextLong();
		
		hour = (hour + offset) % 24;
		
		System.out.printf("%d : %d : %d", hour, min, sec);
		
	}
}
