package Orders;

public class OverRideTest {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.AmazonOrder("Formal","Formal",2); ;
        amazon.AmazonOrder("Formal","Formal",3);
        amazon.AmazonOrder("Formal","Jeans",6);
        System.out.println("Amazon Orders : " +amazon.noOfOrders+amazon.shirtsOrder+ amazon.jeansOrder);
        Order orderLogin = new Order();
        orderLogin.AmazonOrder("shirts","jeans",2);
        System.out.println("Amazon order="+orderLogin);
    }
}
