package MoneyTransfer;

public class HDFC extends RBI{
    int chandu = 600;
    int surya = 500;
    int sravya = 700;
    int hdfcTotalSendAmt = chandu +sravya+surya;

    public HDFC(int sbiBalance, int hdfcBalance) {
        super(sbiBalance, hdfcBalance);
    }

    @Override
    public void sendAmount() {

        if (sbiBalance >= hdfcTotalSendAmt) {

            System.out.println("Sbi sent Balance to Hdfc Bank:"+ "  "+hdfcTotalSendAmt);
        } else {
            System.out.println("Not Transfered");
        }

    }
}
