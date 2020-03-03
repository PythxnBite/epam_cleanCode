package com.epam.cost_estimator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * CostEstimator
 */
public class CostEstimator {

    private int typeOfMaterial;
    private long totalArea;
    private boolean fullyAutomated;

    public static final Logger LOGGER = LogManager.getLogger(App.class);

    public CostEstimator(int typeOfMaterial, long totalArea, boolean fullyAutomated) {
        LOGGER.info("CostEstimator constructor entered");
        this.typeOfMaterial = typeOfMaterial;
        this.totalArea = totalArea;
        this.fullyAutomated = fullyAutomated;
        LOGGER.info("CostEstimator constructor exited");
    }

    public String getEstimation() {

        LOGGER.info("getEstimation() function entered");

        double estimation;
        if (fullyAutomated) {
            estimation = 2500 * totalArea;
        } else {
            switch (typeOfMaterial) {
            case 1:
                estimation = 1200 * totalArea;
                break;
            case 2:
                estimation = 1500 * totalArea;
                break;
            case 3:
                estimation = 1800 * totalArea;
                break;
            default:
                estimation = -1;
                break;
            }
        }
        LOGGER.info("getEstimation() function exited");
        return "Estimated cost for the given details is : " + estimation;
    }

}