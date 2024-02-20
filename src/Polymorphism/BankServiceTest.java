package Polymorphism;

import MethodOverRiding.BankAccountService;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
      double sbiBankintrest =  sbiBankService. calculatorIntrest(1000,86);
        System.out.println("SBI ="+sbiBankintrest);
        HDFCBankService hdfcBankService = new HDFCBankService();
        double hdfcBankIntrest =hdfcBankService.calculatorIntrest(1000,88);
        System.out.println("HDFC="+hdfcBankIntrest);

    }
}
