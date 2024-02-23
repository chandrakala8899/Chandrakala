package Abstract;

import javax.management.StringValueExp;

public class AndroidMobile extends Mobile {
    @Override
    public String Android() {
        return "Android 12";
    }

    public String version;

    @Override
    public String toString() {
        return "AndroidMobile{" +
                "version='" + version + '\'' +
                ", software='" + software + '\'' +
                ", cost=" + cost +
                '}';
    }

    public AndroidMobile(String software, int cost) {
        super(software, cost);
    }

}
