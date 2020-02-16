package com.epam.cost_estimator;

/**
 * CostEstimator
 */
public class CostEstimator {

    private int typeOfMaterial;
    private long totalArea;
    private boolean fullyAutomated;

    public CostEstimator(int typeOfMaterial, long totalArea, boolean fullyAutomated) {
        this.typeOfMaterial = typeOfMaterial;
        this.totalArea = totalArea;
        this.fullyAutomated = fullyAutomated;
    }

    public String getEstimation() {
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
        return "Estimated cost for the given details is : " + estimation;
    }

}