package Polymorphism;

public class RBIBankService {
    public double calculatorIntrest(int principleAmount) {
        int duration = 3;
        double intrest = principleAmount * 0.25* 0.024;
        return intrest;
    }
}
