package Interest;
//import polymorphisam.HDFCBankService;

import Polymorphism.HDFCBankService;

import java.text.DecimalFormat;


public class Schedule {
    public double calculateloanSchedule(double loanAmount, double annualInterestRate, int loanTenureYears) {
        DecimalFormat df = new DecimalFormat(" ");
        double monthlyInterestRate = annualInterestRate / (12 * 100);
        int numberOfPayments = loanTenureYears * 12;
        double monthlyEMI = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));


        System.out.println("Payment Schedule:");

        double remainingLoan = loanAmount;
        for (int i = 1; i <= numberOfPayments; i++) {
            double interest = remainingLoan * monthlyInterestRate;
            double principal = monthlyEMI - interest;
            remainingLoan -= principal;

            System.out.println(i + "" + df.format(principal) + "" + df.format(interest) + "" + df.format(remainingLoan));

            return monthlyEMI;
        }

        for ( loanTenureYears = 1;
             loanTenureYears <= 5; loanTenureYears++) {
             monthlyInterestRate = annualInterestRate / (12 * 100);
            int numberOfPayment = loanTenureYears * 12;

             monthlyEMI = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            System.out.println("For " + loanTenureYears + " year(s),  EMI: " + monthlyEMI);
            }
            return loanAmount;
        }
    }


