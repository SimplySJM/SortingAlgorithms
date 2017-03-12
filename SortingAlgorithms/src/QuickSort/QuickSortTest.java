package QuickSort;

import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] array = {1, 7, 2, 9, 0, 22, 4, 3, 8};

        //Print array before sorting
        System.out.println("Array elements before sorting : \n" + Arrays.toString(array));

        //Sort array elements
        quickSort.sort(array, 0, array.length - 1);

        //Print array after sorting
        System.out.println("Array elements after sorting : \n" + Arrays.toString(array));
    }
}
