package Inheritance;

public class InheritanceTest {
           public static void main(String[] args) {
        Account retailAccount1 = new RetailSAccount("","20000",true,1000,20);
        System.out.println(retailAccount1);
        RetailSAccount retailsAccount = new RetailSAccount("","2500",true,500,10);
           System.out.println(retailsAccount);
        retailsAccount.getAccount(retailsAccount);
        System.out.println( retailsAccount.getAccount(retailsAccount));

    }
      }

