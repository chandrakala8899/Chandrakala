package LoopPractice;

public class SelectionSorting {
    public static void main(String[] args) {
        int array[] = {18, 15, 12, 3, 5, 2};
        for (int sort = 0; sort < array.length; sort++) {

            for (int b = sort+1; b<array.length; b++) {

                if(array[sort]>array[b]){
                   //int t = array[b];
                 int smallestNumber = array[sort];
                 array[sort] = array[b];
                 array[b]= smallestNumber;
                }
            }
            System.out.println(array[sort]);

        }


    }
}
