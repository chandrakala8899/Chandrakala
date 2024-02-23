package Abstract;

public  class IOSMobile extends Mobile {
    public String version;

    @Override
    public String toString() {
        return "IOSMobile{" +
                "version='" + version + '\'' +
                ", software='" + software + '\'' +
                ", cost=" + cost +
                '}';
    }

    public IOSMobile(String software, int cost) {
        super(software, cost);
    }

    @Override
    public String Android() {
        return "IOS 15";
    }

}
