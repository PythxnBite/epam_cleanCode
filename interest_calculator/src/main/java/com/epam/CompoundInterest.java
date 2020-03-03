package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * CompoundInterest
 */
public class CompoundInterest extends Interest {

    double periodDivision;
    public static final Logger LOGGER = LogManager.getLogger(App.class);

    public CompoundInterest(double principle, double rate, double timePeriod, double periodDivision) {
        super(principle, rate / 100.00, timePeriod);
        this.periodDivision = periodDivision;

        LOGGER.info("CompoundInterest Constructor End");
    }

    public double getTotalInterest() {

        LOGGER.info("CompoundInterest getTotalInterest() function entered");

        double amount;
        amount = principle * Math.pow((1 + (rate / periodDivision)), periodDivision * timePeriod);

        return amount;
    }
}