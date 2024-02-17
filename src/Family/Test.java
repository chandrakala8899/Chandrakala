package Family;

public class Test {
    public String getFamily(Father father){
        return "father";
    }
    public static void main(String[] args) {
        Father father = new Father("Ram",4);
        System.out.println(father);

        GrandFather grand = new GrandFather("Shiva",4);
        grand.getNoOfSons();
        grand.getName();
        System.out.println(grand);
        Test test = new Test();
        test.getFamily(father);
        System.out.println(test.getFamily(father));
          }
}
