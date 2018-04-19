package com.training;

import java.util.Comparator;

public class Sortbyname implements Comparator<Pbook> {
	// Used for sorting in ascending order of name
	public int compare(Pbook a, Pbook b) {
		return a.fname.compareTo(b.fname);
	}

}
