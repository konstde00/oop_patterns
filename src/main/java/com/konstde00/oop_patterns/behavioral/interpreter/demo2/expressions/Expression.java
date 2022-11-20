package com.konstde00.oop_patterns.behavioral.interpreter.demo2.expressions;

import com.konstde00.oop_patterns.behavioral.interpreter.demo2.Employee;

public interface Expression {
	
	boolean interpret(Employee context);
}
