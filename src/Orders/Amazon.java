package Orders;

public class Amazon extends Order {
    public boolean Amazonlogin(String userName, String passWord, int noOfOrders) {
        System.out.println("Amazon login");
        return super.Amazonlogin(userName, passWord, noOfOrders);


//    public boolean AmazonOrder(String shirtsOrder, String jeansOrder, int noOfOrders) {
//        return super.AmazonOrder(shirtsOrder, jeansOrder, noOfOrders);
//    }
    }

}
