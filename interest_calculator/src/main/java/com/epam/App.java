package com.epam;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

    public static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        double principle, rate, timePeriod, periodDivision;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the following details: ");

        System.out.print("1. Principle Amount: ");
        principle = scan.nextDouble();
        LOGGER.info("Principle Amount read");

        System.out.print("2. Rate of Interest: ");
        rate = scan.nextDouble();
        LOGGER.info("Rate of interest read");

        System.out.print("3. No. of Years for which interest is to be calculated: ");
        timePeriod = scan.nextDouble();
        LOGGER.info("No. of years interest to be calculated read");

        System.out.print("4. No. of months for which Compound Interest is calculated Every year: ");
        periodDivision = scan.nextDouble();
        LOGGER.info("Period Division of months for Compound Interest Read");

        LOGGER.info("Simple Interest Constructor called");
        SimpleInterest loanSimpleInterest = new SimpleInterest(principle, rate, timePeriod);
        
        LOGGER.info("Compound Interest Constructor called");
        CompoundInterest loanCompoundInterest = new CompoundInterest(principle, rate, timePeriod, periodDivision);
        
        System.out.println("Amount to be paid:");

        LOGGER.info("getTotalInterest() function called for Simple Interest");
        System.out.println("for Simple Interest: " + loanSimpleInterest.getTotalInterest());
        
        LOGGER.info("getTotalInterest() function called for Compound Interest");
        System.out.println("for Compound Interest: " + loanCompoundInterest.getTotalInterest());
        

        scan.close();

    }
}
