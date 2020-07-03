package com.morage.calculator.application;

import com.mortage.calculator.interfaces.MortgageCalculator;
import com.mortage.calculator.interfaces.YearlyCalulator;
import com.mortage.calcultator.implementations.FixedRateMortgageCalculatorTaskImpl;
import com.mortage.calcultator.implementations.InterestOnlyMortgageCalculatorTaskImpl;

public class Mortage
{
	
	public double montlyPayment(MortgageCalculator mortage,int principal, int yearlyRate, int term) {
		return mortage.calculateMonthlyPayment(principal, yearlyRate, term);
		
	}
	public double yearlyPayment(YearlyCalulator mortage,int principal, int yearlyRate, int term) {
		return mortage.calculateYearlyPayment(principal, yearlyRate, term);
	}
	
	public static void main(String[] args) {
		
		int term = 12;
		int principal = 10;
		int yearlyRate  = 10;
		
		Mortage morate = new Mortage();
		
		double monltyPaymentByFixedRate = morate.montlyPayment(new FixedRateMortgageCalculatorTaskImpl(), principal, yearlyRate, term);
		double monltyPaymentByInterestOnly = morate.montlyPayment(new InterestOnlyMortgageCalculatorTaskImpl(), principal, yearlyRate, term);
		
		System.out.println("Montly payment for the Fixed Rate Mortage"+monltyPaymentByFixedRate);
		System.out.println("Montly payment for the Interest Only Mortage "+monltyPaymentByInterestOnly);
		
		
		
	}
}
