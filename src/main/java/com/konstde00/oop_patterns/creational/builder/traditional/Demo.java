package com.konstde00.oop_patterns.creational.builder.traditional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	
	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());

		director.setComputerBuilder(new CheapComputerBuilder());
		director.buildComputer();
		Computer computer = director.getComputer();
		log.info(computer.toString());
		
		director.setComputerBuilder(new ExpensiveComputerBuilder());
		director.buildComputer();
		computer = director.getComputer();
		log.info(computer.toString());
	}
}
