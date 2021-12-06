package com.bl;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		String name[] = new String[size];
		System.out.println("Enter elemrnts of Array : ");
		for (int i = 0; i < size; i++) {
			name[i] = sc.nextLine();

		}
		System.out.println("After Reversing Array Element --->");
		System.out.println("hai ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.println("" + name[i] + "");
			sc.close();
		}
	}

}
