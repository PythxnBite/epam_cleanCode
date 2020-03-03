package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * SimpleInterest
 */
public class SimpleInterest extends Interest {

    public static final Logger LOGGER = LogManager.getLogger(App.class);

    public SimpleInterest(double principle, double rate, double timePeriod) {

        super(principle, rate / 100.00, timePeriod);

        LOGGER.info("SimpleInterest Constructor End");

    }

    public double getTotalInterest() {

        LOGGER.info("Simple Interest getTotalInterest() function entered");

        double amount;
        amount = principle * (1 + rate * timePeriod);

        return amount;
    }
}