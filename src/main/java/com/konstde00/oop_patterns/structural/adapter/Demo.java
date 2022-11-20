package com.konstde00.oop_patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Demo {

	public static void main(String[] args) {

		  int[] numbers = new int[]{34, 2, 4, 12, 1};
		  
		  Sorter sorter = new SortListAdapter();      
		  numbers = sorter.sort(numbers);

		  log.info("Numbers after sort: "
				  + Arrays.toString(numbers));
	}
}
