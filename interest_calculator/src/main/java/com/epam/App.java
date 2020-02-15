package com.epam;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        double principle, rate, timePeriod, periodDivision;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the following details: ");

        System.out.print("1. Principle Amount: ");
        principle = scan.nextDouble();

        System.out.print("2. Rate of Interest: ");
        rate = scan.nextDouble();

        System.out.print("3. No. of Years for which interest is to be calculated: ");
        timePeriod = scan.nextDouble();

        System.out.print("4. No. of months for which Compound Interest is calculated Every year: ");
        periodDivision = scan.nextDouble();

        SimpleInterest loanSimpleInterest = new SimpleInterest(principle, rate, timePeriod);

        CompoundInterest loanCompoundInterest = new CompoundInterest(principle, rate, timePeriod, periodDivision);

        System.out.println("Amount to be paid:");
        System.out.println("for Simple Interest: " + loanSimpleInterest.getTotalInterest());
        System.out.println("for Compound Interest: " + loanCompoundInterest.getTotalInterest());

        scan.close();

    }
}
