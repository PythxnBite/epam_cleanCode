package com.epam;

/**
 * CompoundInterest
 */
public class CompoundInterest extends Interest {

    double periodDivision;

    public CompoundInterest(double principle, double rate, double timePeriod, double periodDivision) {
        super(principle, rate / 100.00, timePeriod);
        this.periodDivision = periodDivision;
    }

    public double getTotalInterest() {
        double amount;
        amount = principle * Math.pow((1 + (rate / periodDivision)), periodDivision * timePeriod);

        return amount;
    }
}