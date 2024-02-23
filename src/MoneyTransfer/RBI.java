package MoneyTransfer;

public abstract class RBI {
        protected int sbiBalance;
        protected int hdfcBalance;


        public RBI(int sbiBalance,int hdfcBalance) {
            this.sbiBalance = sbiBalance;
            this.hdfcBalance=hdfcBalance;
        }
        public abstract void sendAmount();

        public double getBalance() {
            return getBalance();
        }
}
