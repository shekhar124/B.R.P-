package com.bl;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month :");
		int month = sc.nextInt();
		System.out.println("Enter Day :");
		int day = sc.nextInt();
		if ((month == 4 || month == 5) && (day <= 30 && day != 0)) {
			System.out.println("TRUE");

		} else if (month == 6 && day <= 20) {
			System.out.println("True");
		} else {
			System.out.println("Flase");
			sc.close();
		}

	}

}
