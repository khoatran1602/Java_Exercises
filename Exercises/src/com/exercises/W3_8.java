Main class
package com.company;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        printHeader();
        printData();
    }

    private static void printHeader() {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%12s%15s%15s%15s%15s\n", "", "", "Married", "Married", "");
        System.out.printf("%12s%15s%15s%15s%15s\n", "", "", "Individual", "Individual", "Head");
        System.out.printf("%12s%15s%15s%15s%15s\n", "Taxable", "Unmarried", "Filling", "Filing", "of");
        System.out.printf("%12s%15s%15s%15s%15s\n", "Income", "Individual", "Separately", "Jointly", "Households");
        System.out.println("------------------------------------------------------------------------");
    }

    private static void printData() {
        // Setup a formatter
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setGroupingUsed(true);
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);

        // Print data
        final double START = 10000, END = 1000000, STEP = 10000;
        for (double income = START; income <= END; income += STEP) {
            System.out.printf("%12s", formatter.format(income));
            for (int status = Tax.UNMARRIED_INDIVIDUAL; status <= Tax.HEAD_OF_HOUSEHOLD; status++) {
                Tax tax = new Tax(status, income);
                System.out.printf("%15s", formatter.format(tax.calTax()));
            }
            System.out.println();
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------
Tax class
package com.company;

public class Tax {
    public static final int UNMARRIED_INDIVIDUAL = 0,
                            MARRIED_INDIVIDUAL_FILING_SEPARATELY = 1,
                            MARRIED_INDIVIDUAL_FILING_JOINTLY = 2,
                            HEAD_OF_HOUSEHOLD = 3;

    public static final int[][] BRACKETS = {
            {9875, 40125, 85525, 163300, 207350, 518400},   // Tax brackets for unmarried individual
            {9875, 40125, 85525, 163300, 207350, 311025},   // Tax brackets for married individual filing separately
            {19750, 80250, 171050, 326600, 414700, 622050}, // Tax brackets for married individual filing jointly
            {14100, 53700, 85500, 163300, 207350, 518400}   // Tax brackets for head of household
    };

    public static final double[] RATES = {.10, .12, .22, .24, .32, .35, .37};

    // Data fields
    private final int filingStatus;
    private final double income;

    public Tax(int filingStatus, double income) {
        this.filingStatus = filingStatus;
        this.income = income;
    }

    // Method
    public double calTax() {
        double tax = 0, taxableAmount = income;

        // Check from the highest to lowest bracket and calculate tax accordingly
        for (int i = 5; i >= 0; i--) {
            if (taxableAmount > BRACKETS[filingStatus][i]) {
                tax += (taxableAmount - BRACKETS[filingStatus][i]) * RATES[i + 1];
                taxableAmount = BRACKETS[filingStatus][i];
            }
        }

        // Calculate tax for the lowest bracket
        tax += taxableAmount * RATES[0];

        return tax;
    }
}
