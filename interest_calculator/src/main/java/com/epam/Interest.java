package com.epam;

/**
 * Interest
 */
public class Interest {

    protected double principle, rate, timePeriod;

    protected Interest(double principle, double rate, double timePeriod) {
        this.principle = principle;
        this.rate = rate;
        this.timePeriod = timePeriod;
    }
}