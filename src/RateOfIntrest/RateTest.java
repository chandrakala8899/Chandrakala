package RateOfIntrest;

public class RateTest {
    public static void main(String[] args) {
        SBIService sbiService = new SBIService();
        AxisBankService axisBankService = new AxisBankService();
       double loanAmount = 500000;
        int loanTenure = 12;
        double rateOfInterest = 0.02;
       // System.out.println("SBI EMI="+sbiService.calculateEmi(500000.00,12));
       // System.out.println("AxisBank="+ axisBankService.calculateEmi(500000.00,12));
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println("SBI EMI: " + sbiService.calculateEmi(loanAmount, loanTenure, rateOfInterest));
            } else {
                System.out.println("AXIS EMI: " + axisBankService.calculateEmi(loanAmount, loanTenure, rateOfInterest));
            }
        }
    }
}
