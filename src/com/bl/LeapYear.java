package com.bl;

import java.util.Scanner;

public class LeapYear {

	public LeapYear() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Leapyear");
		} else
			System.out.println("NOT A LEAP YEAR");

	}

	public static void main(String[] args) {

		LeapYear le = new LeapYear();
		
	}

}
