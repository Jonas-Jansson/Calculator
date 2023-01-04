//Calculator by Jonas Jansson.

package com.main;

import java.util.Scanner;

public class Calculator {

	Number numberOne;
	Number numberTwo;

	public void runCalculator() {
		requestNumbers();
		requestOperatorAndDisplayResult();
	}

	public void requestNumbers() {
		var scan = new Scanner(System.in);
		System.out.print("Ange tal ett: ");
		String stringOne = scan.nextLine();
		System.out.println();
		double doubleOne = 0;
		try {
			doubleOne = Double.parseDouble(stringOne);
		} catch (NumberFormatException e) {
			e.getMessage();
			System.out.print("Du angav inte ett tal.");
			System.exit(0);
		}
		numberOne = new Number(doubleOne);
		System.out.print("Ange tal två: ");
		String stringTwo = scan.nextLine();
		System.out.println();
		double doubleTwo = 0;
		try {
			doubleTwo = Double.parseDouble(stringTwo);
		} catch (NumberFormatException e) {
			e.getMessage();
			System.out.print("Du angav inte ett tal.");
			System.exit(0);
		}
		numberTwo = new Number(doubleTwo);
	}

	public void requestOperatorAndDisplayResult() {
		var scan = new Scanner(System.in);
		System.out.print("Ange operator (+, -, * eller /): ");
		String operator = scan.nextLine();
		System.out.println();
		if(operator.equals("+"))
			System.out.print("Resultat: " + (numberOne.getNumber() + numberTwo.getNumber()));
		else if(operator.equals("-"))
			System.out.print("Resultat: " + (numberOne.getNumber() - numberTwo.getNumber()));
		else if(operator.equals("*"))
			System.out.print("Resultat: " + (numberOne.getNumber() * numberTwo.getNumber()));
		else if(operator.equals("/") && numberTwo.getNumber() == 0)
			System.out.print("Division med noll är omöjlig.");
		else if(operator.equals("/"))
			System.out.print("Resultat: " + (numberOne.getNumber() / numberTwo.getNumber()));
		else
			System.out.print("Du angav inte en godkänd operator.");
	}

}