package RateOfIntrest;

public class AxisBankService extends RBIService{

    public double calculateEmi(double loanAmount,int loanTenure,double rateOfIntrest){
        double emi = rateOfIntrest*loanAmount*loanTenure/(loanTenure-1);
        return emi;
    }

}
