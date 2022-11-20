package com.konstde00.oop_patterns.structural.adapter;

import java.util.Collections;
import java.util.List;

public class NumberSorter {
	public List<Integer> sortList(List<Integer> numbers) {
		Collections.sort(numbers);
		return numbers;
	}
}
