package org.greatlearning.paymoney.main;

import org.greatlearning.paymoney.services.CheckTransaction;

public class Main {

	public static void main(String[] args) {
		CheckTransaction transaction = new CheckTransaction();
		transaction.insertValue();
		System.out.println();
		transaction.diplayValue();
		System.out.println();
		transaction.targetCheck();
	}
}
