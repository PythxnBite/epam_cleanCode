package com.epam.cost_estimator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Select type of Materials and if full Automation is required from the menu below:");
        System.out.println("1. Standard Materials with no Automation");
        System.out.println("2. Above Standard Materials with no Automation");
        System.out.println("3. High Standard Materials with no Automation");
        System.out.println("4. High Standard Materials with Full Automation");

        int option;
        long totalArea;
        boolean fullyAutomated;
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();

        System.out.print("Enter the total Surface Area of the house: ");
        totalArea = scan.nextLong();

        if (option == 4)
            fullyAutomated = true;
        else
            fullyAutomated = false;

        CostEstimator estimate = new CostEstimator(option, totalArea, fullyAutomated);
        System.out.println(estimate.getEstimation());

        scan.close();

    }
}
