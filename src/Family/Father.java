package Family;

public class Father extends GrandFather{
    public String name;

    public Father(String name,int noOfSons) {
        super(name,noOfSons);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }
}
