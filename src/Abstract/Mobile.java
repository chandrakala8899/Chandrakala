package Abstract;

public abstract class Mobile {
    public    String software = "Android";
    public int cost =350000;
    public String  mobileTest(String software,int cost ){
       software = "123";
       cost = 45000;
       Android();

        return "mobile" ;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "software='" + software + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Mobile(String software, int cost) {
        this.software = software;
        this.cost = cost;

    }

    public abstract String Android();
}
