package Orders;

public class OverRideTest {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.AmazonOrder("Formal","Formal",2);
        amazon.AmazonOrder("Formal","Formal",3);
        amazon.AmazonOrder("Formal","Jeans",4);
        System.out.println("Amazon Orders="+amazon.noOfOrders);

        Order orderLogin = new Order();
        orderLogin.AmazonOrder("4","8",2);
        System.out.println("Amazon order="+orderLogin);
    }
}
