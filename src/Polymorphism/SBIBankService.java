package Polymorphism;

public class SBIBankService extends RBIBankService {
    public double calculatorIntrest(int principleAmount) {
        double totalAmount = 0;
        double intrestAmount = super.calculatorIntrest(principleAmount);
        totalAmount = intrestAmount +principleAmount;
        return totalAmount;
    }
    public double calculatorIntrest(int principleAmount,int days) {
        double totalAmount = 0;
        if(days>85){
            return this.calculatorIntrest(principleAmount);
        }
          return totalAmount;
        }

    }