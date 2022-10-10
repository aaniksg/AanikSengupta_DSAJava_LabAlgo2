package org.greatlearning.currencymanagement.main;

import org.greatlearning.currencymanagement.services.MergeSort;
import org.greatlearning.currencymanagement.services.NotesCount;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE SIZE OF CURRENCY DENOMINATIONS");
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("ENTER THE CURRENCY DENOMINATIONS VALUE");
		for (int i = 0; i < notes.length; i++) {
			System.out.print("ENTER DENOMINATION " + (i + 1) + " - ");
			notes[i] = sc.nextInt();
		}

		System.out.println("ENTER THE AMOUNT YOU WANT TO PAY");
		int amount = sc.nextInt();

		mergeSort.sort(notes, 0, notes.length - 1);
		notesCount.notesCount(notes, amount);
		sc.close();
	}
}
