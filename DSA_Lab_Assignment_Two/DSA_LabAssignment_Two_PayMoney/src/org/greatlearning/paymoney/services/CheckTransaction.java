package org.greatlearning.paymoney.services;

import java.util.Scanner;

public class CheckTransaction {

	Scanner sc = new Scanner(System.in);
	int arr[];
	int size;

	public void insertValue() {

		System.out.println("ENTER THE SIZE OF TRANSACTION ARRAY -");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("ENTER THE VALUES OF ARRAY");
		for (int i = 0; i < size; i++) {
			System.out.print("ENTER VALUE AT POSITION " + (i + 1) + " - ");
			arr[i] = sc.nextInt();
		}
	}

	public void diplayValue() {

		System.out.print("TRANSACTION ARRAY = { ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
		System.out.println();
	}

	public void targetCheck() {
		System.out.println("ENTER THE TOTAL NUMBER OF TARGETS THAT NEEDS TO BE ACHIEVED -");
		int targetNo = sc.nextInt();
		int count = 1;

		while (targetNo-- != 0) {
			int flag = 0;
			long target;
			System.out.println();
			System.out.println("ENTER THE VALUE FOR TARGET NO. " + count + " -");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum = sum + arr[i];
				if (sum >= target) {
					System.out.println("TARGET ACHIEVED AFTER " + (i + 1) + " TRANSACTION");
					flag = 1;
					count++;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("GIVEN TARGET IS NOT ACHIEVED");
				count++;
			}
		}
	}
}