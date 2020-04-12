package com.example;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add() {
		this.calculator.addAction(firstNum, secondNum);
	}

	public void sub() {
		this.calculator.subAction(firstNum, secondNum);
	}

	public void multi() {
		this.calculator.multiAction(firstNum, secondNum);
	}

	public void div() {
		this.calculator.divAction(firstNum, secondNum);
	}

}
