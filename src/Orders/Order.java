package Orders;

public class Order {
    public  int noOfOrders;
     public String shirtsOrder;
     public String jeansOrder;

    @Override
    public String toString() {
        return "Order{" +
                "noOfOrders=" + noOfOrders +
                ", shirtsOrder='" + shirtsOrder + '\'' +
                ", jeansOrder='" + jeansOrder + '\'' +
                '}';
    }

    public boolean Amazonlogin(String userName, String passWord, int noOfOrders) {
        System.out.println("Amazon Login SuperClass");
        if(userName.equals("chandu")&& passWord.equals("2244")){


        }
      return this.AmazonOrder(shirtsOrder,jeansOrder,noOfOrders);
    }
    public boolean AmazonOrder(String shirtsOrder,String jeansOrder,int noOfOrders){
       this. shirtsOrder = shirtsOrder;
        this.jeansOrder = jeansOrder;
        this.noOfOrders = noOfOrders;
        return true;
    }

}
