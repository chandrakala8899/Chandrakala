package Abstract;

public class AbstractTest {
    public static void main(String[] args) {

        AndroidMobile androidMobile = new AndroidMobile("Android",30000);
        androidMobile.version = "5.8";
        IOSMobile iosMobile = new IOSMobile("Apple",400000);
        iosMobile .version = "8.9";
        System.out.println(iosMobile .Android() +iosMobile);
        System.out.println(androidMobile.Android() +androidMobile);
    }
}
