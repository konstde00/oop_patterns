package com.konstde00.oop_patterns.behavioral.interpreter.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {

	public InterpreterContext interpreterContext;

	public Demo(InterpreterContext interpreterContext) {
		this.interpreterContext = interpreterContext;
	}

	public String interpret(String str) {
		Expression exp;

		// create rules for expressions

		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else {
			return str;
		}

		return exp.interpret(interpreterContext);
	}

	public static void main(String args[]) {
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";

		Demo client = new Demo(new InterpreterContext());
		log.info(str1 + " = " + client.interpret(str1));
		log.info(str2 + " = " + client.interpret(str2));
	}
}