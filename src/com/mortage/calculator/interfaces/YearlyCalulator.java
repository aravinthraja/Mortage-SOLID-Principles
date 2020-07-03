package com.mortage.calculator.interfaces;

public interface YearlyCalulator {
	public double calculateYearlyPayment (double principal, double yearlyRate, int term);
}
