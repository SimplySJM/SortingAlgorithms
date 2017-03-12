package BubbleSort;


import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String [] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {1, 7, 2, 9, 0, 22, 4, 3, 8};

        //Print array before sorting
        System.out.println("Array elements before sorting : \n"+Arrays.toString(array));

        //Sort array elements
        bubbleSort.sort(array);

        //Print array after sorting
        System.out.println("Array elements after sorting : \n"+Arrays.toString(array));
    }
}
