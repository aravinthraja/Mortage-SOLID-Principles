package com.mortage.calcultator.implementations;

import com.mortage.calculator.interfaces.MortgageCalculator;
import com.mortage.calculator.interfaces.YearlyCalulator;

public class FixedRateMortgageCalculatorTaskImpl implements MortgageCalculator,YearlyCalulator{

	@Override
	public double calculateMonthlyPayment(double principal, double yearlyRate, int term) {

		// Monthly intertest rate
		double monthlyRate = yearlyRate / 100 / 12;

		// Term in months
		int termInMonths = term * 12;

		// calculate monthly payment
		double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
		
		// round to two decimals
		monthlyPayment = (double) Math.round(monthlyPayment * 100) / 100;
		return monthlyPayment;
	}

	@Override
	public double calculateYearlyPayment(double principal, double yearlyRate, int term) {
		// TODO Auto-generated method stub
		return 0;
	}
}
