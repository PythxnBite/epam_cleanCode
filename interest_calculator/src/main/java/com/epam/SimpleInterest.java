package com.epam;

/**
 * SimpleInterest
 */
public class SimpleInterest extends Interest {

    public SimpleInterest(double principle, double rate, double timePeriod) {
        super(principle, rate / 100.00, timePeriod);
    }

    public double getTotalInterest() {

        double amount;
        amount = principle * (1 + rate * timePeriod);

        return amount;
    }
}