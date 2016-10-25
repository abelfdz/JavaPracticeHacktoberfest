package com.hacktoberfest;

import java.util.Scanner;

public class numerossonigualesono {

	public static void main(String[] args) {
		int n1, n2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero 1:");
		n1 = sc.nextInt();

		System.out.println("Introduce numero 2:");
		n2 = sc.nextInt();

		if (n1 == n2) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}
	}
}
