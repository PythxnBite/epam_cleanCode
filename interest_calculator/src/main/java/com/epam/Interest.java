package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Interest
 */
public class Interest {

    protected double principle, rate, timePeriod;
    public static final Logger LOGGER = LogManager.getLogger(App.class);

    protected Interest(double principle, double rate, double timePeriod) {
        
        LOGGER.info("Interest class Constructor called");

        this.principle = principle;
        this.rate = rate;
        this.timePeriod = timePeriod;
    }
}