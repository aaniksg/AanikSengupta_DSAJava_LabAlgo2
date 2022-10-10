package org.greatlearning.currencymanagement.services;

public class NotesCount {

	public void notesCount(int[] notes, int amount) {
		int[] noteCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("EXACT AMOUNT CANNOT BE GIVEN WITH THE HIGHEST DENOMINATION");
			} else {
				System.out.println("YOUR PAYMENT APPROACH IN ORDER TO GIVE MIN NO. OF NOTES WILL BE");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println("CURRENCY DENOMINATION " + notes[i] + " : " + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " - NOTES OF DENOMINATION 0 IS INVALID");
		}
	}
}
