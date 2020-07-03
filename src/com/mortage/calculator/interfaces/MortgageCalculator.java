package com.mortage.calculator.interfaces;

public interface MortgageCalculator {
	public double calculateMonthlyPayment (double principal, double yearlyRate, int term);
}
