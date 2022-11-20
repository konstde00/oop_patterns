package com.konstde00.oop_patterns.behavioral.interpreter.demo2;

import com.konstde00.oop_patterns.behavioral.interpreter.demo2.expressions.Expression;
import com.konstde00.oop_patterns.behavioral.interpreter.demo2.expressions.ExpressionParser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {

	public static void main(String[] args) {
		Engineer artem = new Engineer(1001L, "Artem", "Developer", Department.ENGINEERING, 75000);
		Engineer vitalii = new Engineer(1002L, "Vitalii", "Sr. Developer", Department.ENGINEERING, 90000);
		Engineer eugenii = new Engineer(1003L, "Eugenii", "Lead", Department.ENGINEERING, 100000);
		Engineer david = new Engineer(1004L, "David", "QA", Department.ENGINEERING, 70000);
		Manager andrey = new Manager(1005L, "Andrey", "Manager", Department.ENGINEERING, 110000);
		Engineer aleksey = new Engineer(1006L, "Aleksey", "Developer", Department.ENGINEERING, 95000);
		Manager yaroslav = new Manager(1007L, "Yaroslav", "Sr. Manager", Department.ENGINEERING, 140000);
		Engineer egor = new Engineer(1008L, "Egor", "Developer", Department.ENGINEERING, 85000);
		Manager maxim = new Manager(1009L, "Maxim", "Product Manager", Department.ENGINEERING, 150000);
		Engineer sveta = new Engineer(1010L, "Sveta", "Engineer", Department.ENGINEERING, 80000);

		andrey.manages(artem);
		andrey.manages(david);
		andrey.manages(vitalii);

		yaroslav.manages(eugenii);
		yaroslav.manages(aleksey);
		yaroslav.manages(sveta);

		maxim.manages(andrey);
		maxim.manages(egor);
		maxim.manages(yaroslav);

		String contextString = "Desig:manager, Deptt:eng, Manages:artem, salary:110000";
		Expression expression = ExpressionParser.parseExpression(contextString);
		log.info("contextString = " + contextString);
		log.info(System.lineSeparator());
		log.info(andrey.toString());
		log.info(String.format("For '%s', %s: %s.\n", andrey.getEmployeeName(), expression, expression.interpret(andrey)));

		log.info("=======================================================================\n");
		contextString = "Desig:developer, Deptt:eng, salary:<85000";
		expression = ExpressionParser.parseExpression(contextString);
		log.info("contextString = " + contextString);
		log.info(System.lineSeparator());
		log.info(artem.toString());
		log.info(String.format("For '%s', %s: %s.\n", artem.getEmployeeName(), expression, expression.interpret(artem)));
		log.info(System.lineSeparator());
		log.info(aleksey.toString());
		log.info(String.format("For '%s', %s: %s.\n", aleksey.getEmployeeName(), expression,
				expression.interpret(aleksey)));
	}
}
