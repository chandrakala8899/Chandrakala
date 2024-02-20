package Family;

public class GrandFather {
     private String name;
    private int noOfSons;

    public String getName() {
        return name;
    }

    public GrandFather(String name, int noOfSons) {
        this.name = name;
        this.noOfSons = noOfSons;
    }

    public int getNoOfSons() {
        return noOfSons;
    }
    public  String getgrandpa(){
        name = "Shiva";
        noOfSons = 4;
        return "grandpa";
            }

    @Override
    public String toString() {
        return "GrandFather{" +
                "name='" + name + '\'' +
                ", noOfSons=" + noOfSons +
                '}';
    }
}
