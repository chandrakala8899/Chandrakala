package MoneyTransfer;

public class TransferTest {
    public static void main(String[] args) {
        SBI sbi = new SBI(15000,20000);
        HDFC hdfc = new HDFC(15000,20000);
        System.out.println(  "SBI Balance  ="+sbi.sbiBalance);
        System.out.println( "HDFCBalance ="   +hdfc.hdfcBalance);
        System.out.println(    "SBI Total Amount ="   +sbi.sbiTotalSendAmt);
        System.out.println( "HDFC Total Amount ="  +hdfc.hdfcTotalSendAmt);
        if(hdfc.hdfcTotalSendAmt >sbi.sbiTotalSendAmt){
            int remainingAmount = hdfc.hdfcTotalSendAmt - sbi.sbiTotalSendAmt;
            System.out.println("remainingAmount =" +remainingAmount);
            int newHdfcBalance = hdfc.hdfcBalance - remainingAmount;
            int newSBIBalance = sbi.sbiBalance +remainingAmount ;
            System.out.println( "New HDFC balance ="    +newHdfcBalance);
            System.out.println( "New SBI Balance ="    +newSBIBalance);
        }
        if( hdfc.hdfcTotalSendAmt <sbi.sbiTotalSendAmt){
            int remainingAmount = sbi.sbiTotalSendAmt - hdfc.hdfcTotalSendAmt;
            System.out.println(     "remainingAmount = "      +remainingAmount);
            int newHdfcBalance = hdfc.hdfcBalance + remainingAmount;
            int newSBIBalance = sbi.sbiBalance  - remainingAmount ;
            System.out.println(  "New HDFC balance ="     +newHdfcBalance);
            System.out.println(  "New SBI Balance = "       +newSBIBalance);

        }
    }
}
