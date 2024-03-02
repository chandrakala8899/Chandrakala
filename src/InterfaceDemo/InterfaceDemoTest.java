package InterfaceDemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankingService hdfcBankingService = new HDFCBankService();
        RBIBankingService sbiBankinService = new SBIBankingService();
            String hdfcStatus = hdfcBankingService.transfer("2244","4466",10000);
        String sbiStatus =  sbiBankinService.transfer("1122","2233",20000);
        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);
    }
}
