package Interest;
//import polymorphisam.HDFCBankService;


public class EmiTest {
        public static void main(String[] args) {
            Schedule schedule = new Schedule();
            SbiService bankService = new SbiService();
            double sbi = bankService.calculateAmt(1000003);
            System.out.println("SBI ProcessingFee : " + sbi);
            double loanSbi = bankService.calculateloanSchedule(500000, 0.010, 1);
            System.out.println("SBI Loan Ammount  :" + loanSbi);

            System.out.println("");

            HDFCService hdfcBankService = new HDFCService();
            double hdfc = hdfcBankService.calculateAmt(700000);
          System.out.println("Hdfc ProcessingFee : " + hdfc);
           double loanHdfc = hdfcBankService.calculateloanSchedule(700000, 1, 1);
            System.out.println("Hdfc Loan Ammount  :" + loanHdfc);
        }

        }

