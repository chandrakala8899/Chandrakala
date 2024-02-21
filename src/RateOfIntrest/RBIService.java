package RateOfIntrest;

public class RBIService {
    public double calculateEmi(double loanAmount,int loanTenure){
        double rateOfIntrest =getRateOfIntrest();
        double emi = rateOfIntrest*loanAmount*loanTenure/(loanTenure-1);
        return emi;
    }
    public double getRateOfIntrest(){
        return 0.02;

    }
}

