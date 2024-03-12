package ForLoop;

public class ReverseName {
    public static void main(String[] args) {
        String name = "udnahc";
        StringBuilder name1 = new StringBuilder();
        name1.append(name);
        name1.reverse();
        System.out.println("name : " + name1);
       String fatherName = "srinu";
       String reverseName = "";
       for(int i = fatherName.length() -1; i>=0; i--){

           reverseName = reverseName +fatherName.charAt(i);


       }
        System.out.println("ReverseName : " + reverseName);


    }



}

