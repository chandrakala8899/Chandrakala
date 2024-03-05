package ForLoop;

import jdk.dynalink.beans.StaticClass;

public class ForDemo {
    public static void main(String[] args) {
        int array[] = {3, 4, 1, 5};
        for (int index = 0; index < array.length; index++)
        {
            for (int j = index + 1; j < array.length; j++)
                if (array[index] > array[j]) {
                    int temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                }
            if (index < array.length - 1) {
                System.out.print(array[index] + ", ");
            } else {
                System.out.print(array[index]);
            }
         }
        for (int index = array.length - 1; index >= 0; index--)
        {
            if (index > 0) {
                System.out.print(array[index] + ", ");
            } else {
                System.out.print(array[index]);
            }
        }
//     for(int count =10;count <=100; count = count+10 ){
//          System.out.println("count " +count);
//
//       }
        } }

