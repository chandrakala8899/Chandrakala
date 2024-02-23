package MoneyTransfer;


public class SBI extends RBI {

    int chandu = 400;
    int surya = 500;
    int sravya = 1000;
    int sbiTotalSendAmt = chandu +sravya+surya;

    public SBI(int sbiBalance, int hdfcBalance) {
        super(sbiBalance, hdfcBalance);
    }

    @Override
    public void sendAmount() {
        if (sbiBalance >= sbiTotalSendAmt) {

            System.out.println("Sbi sent Balance to Hdfc Bank:"+ "  "+sbiTotalSendAmt);
        } else {
            System.out.println("Not Transfered");
        }

    }
}
